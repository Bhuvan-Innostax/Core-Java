class vehicle{
    void status(){
        System.out.println("Vehicle is running . . .");
    }
}

class Bike extends vehicle{
    @Override
    void status(){
        System.out.println("Bike is running . . .");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        vehicle vehicle = new vehicle();
        vehicle.status();

        Bike veh = new Bike();
        veh.status();
        
    }
}
