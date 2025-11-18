// Parent Class
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

// Child Class 1
class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running");
    }
}

// Child Class 2
class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car is running");
    }
}

// Main Class
public class task9{
    public static void main(String[] args) {

        Vehicle v1= new Bike();  // Reference of parent class
   // Vehicle reference pointing to Bike object
        v1.run();          // Calls Bike's run()

       Vehicle v2= new Car();    // Vehicle reference pointing to Car object
        v2.run();          // Calls Car's run()
    }
}

