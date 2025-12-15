abstract class Vehicle {
    abstract void calculateSpeed(double distance, double time);
    abstract void calculateVelocity(double displacement, double time);
}
class Car extends Vehicle {
    public void calculateSpeed(double distance, double time) {
        double speed = distance / time;
        System.out.println("Car Speed = " + speed + " km/h");
    }
    public void calculateVelocity(double displacement, double time) {
        double velocity = displacement / time;
        System.out.println("Car Velocity = " + velocity + " km/h");
    }

}
class Bike extends Vehicle {
    public void calculateSpeed(double distance, double time) {
        double speed = distance / time;
        System.out.println("Bike Speed = " + speed + " km/h");
    }
    public void calculateVelocity(double displacement, double time) {
        double velocity = displacement / time;
        System.out.println("Bike Velocity = " + velocity + " km/h");
    }
}
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v;
        v = new Car();
        v.calculateSpeed(120, 2);      
        v.calculateVelocity(100, 2);    
        v = new Bike();
        v.calculateSpeed(60, 2);
        v.calculateVelocity(50, 2);
    }
}
