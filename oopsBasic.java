class Car{
    private final String carName;
    private  int price;
    public Car(String car , int price){
        this.carName = car;
        this.price = price;
    }
    public int changeCarName(int price){
        this.price = price;
        return price;
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
        car1.changeCarName(100000);
        System.out.println(car1.getCarName());

        
    }
}
