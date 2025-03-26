

class Employee{
    public String employeeName;
    public String employeeId;
    public Drinks drinkChoice;
    enum Drinks{
        TEA,
        COFFEE,
    }
    public Employee(String name , String id , String choice ){
        this.employeeName = name ;
        this.employeeId = id;
        this.drinkChoice = Drinks.valueOf(choice.toUpperCase());
    }

    

    public String getEmployeeName(){
        return employeeName;

    }
    
    public String getEmployeeId(){
        return employeeId;
    }
    public Drinks getDrinks(){
        return drinkChoice;
    }
}

class TechDepartment extends Employee{
    public final String departmentName;
    public String teamLead;

    public TechDepartment(String name , String id , String choice, String Tname){
        super(name, id, choice);
        this.departmentName = "Tech Department";
        this.teamLead = Tname;
    }

    public String[] getAll(){
        String[] sendData = new String[4];
        sendData[0] = employeeName;
        sendData[1] = employeeId;
        sendData[2] = departmentName;
        sendData[3] = teamLead;
        return sendData;

    }

}


class NonTechDepartment extends Employee{
    public final String departmentName;
    public String teamLead;

    public NonTechDepartment(String name , String id , String choice, String Tname){
        super(name, id, choice);
        this.departmentName = "Non-Tech Department";
        this.teamLead = Tname;
    }

    public String[] getAll(){
        String[] sendData = new String[4];
        sendData[0] = employeeName;
        sendData[1] = employeeId;
        sendData[2] = departmentName;
        sendData[3] = teamLead;
        return sendData;

    }

}
public class Inheritence {
    public static void main(String[] args) {
        TechDepartment emp1 = new TechDepartment("Rahul", "12987", "tea", "Akash");
        NonTechDepartment emp2 = new NonTechDepartment("Ramesh", "789456", "Coffee", "Ranjit");
        String[] emp1Details = emp1.getAll();
        for(String data : emp1Details){
            System.out.println(data);
        }
        String[] emp2Details = emp2.getAll();
        for(String data : emp2Details){
            System.out.println(data);
        }
        System.out.println(emp2.getDrinks());
        
        
    }
}
