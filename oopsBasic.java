class Car{
    private String carName;
    private int price;
    public Car(String car , int price){
        this.carName = car;
        this.price = price;
    }
    public int  getPrice(){
        return price;
    }
    public String getCarName(){
        return carName;
    }
}


public class oops {
    public static void main(String[] args) {
        Car car1 = new Car("Maruti 800", 500000);
        System.out.println(car1.getCarName());
        System.out.println(car1.getPrice());
        
    }
}
