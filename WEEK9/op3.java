abstract class Appliance{
    String brand;
    int power;
    abstract void turnOn();
    abstract void turnOff();
}
class Washingmachine extends Appliance{
    void turnOn(){
        System.out.println("Washing machine turning on...");
    }
    void turnOff(){
        System.out.println("Washing machine turning off...");
    }
}
class Refrigerator extends Appliance{
    void turnOn(){
        System.out.println("Refrigerator turning on...");
    }
    void turnOff(){
        System.out.println("Refrigerator turning off...");
    }
}
public class op3 {
    public static void main(String[] args) {
        Refrigerator r = new Refrigerator();
        r.turnOff();
        Washingmachine w = new Washingmachine();
        w.turnOn();
    }
}
