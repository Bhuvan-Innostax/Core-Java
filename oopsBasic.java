class Car{
    private  String carName;
    private final int price;
    public Car(String car , int price){
        this.carName = car;
        this.price = price;
    }
    public String changeCarName(String newName){
        this.carName = newName;
        return carName;
    }
    public int  getPrice(){
        return price;
    }
    public String getCarName(){
        return carName;
    }
}


public class oopsBasic {
    public static void main(String[] args) {
        Car car1 = new Car("Maruti 800", 500000);
        System.out.println(car1.getCarName());
        System.out.println(car1.getPrice());
        car1.changeCarName("HondaCity");
        System.out.println(car1.getCarName());

        
    }
}
