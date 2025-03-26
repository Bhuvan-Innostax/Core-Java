interface Printable{      
    void print();   
}
interface Price{
  int calcPages();
}

  class Printer implements Printable,Price{    
    private String content = "Hii EveryOne !";  
    public void print(){
      System.out.println(content);
    }   
    public int calcPages(){
        return content.length() * 10 ;
    }
  }  

  public class OopsInterface{  
    public static void main(String args[]){      
      Printer p=new Printer();  
      p.print();  
      System.out.println("Total price :"+p.calcPages());  
   }      
  }      