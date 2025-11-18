class Vehicle{
    void cost(){
        System.out.println(1);
    }
}
class Bus extends Vehicle{
    void display(){
        System.out.println(2);
    }
}
class Train extends Vehicle{
    void display(){
        System.out.println(3);
    }
}
public class Main {
    public static void main(String[] args) {
        Bus b = new Bus();
        b.cost();
        b.display();
        Train t = new Train();
        t.cost();
        t.display();
    }
}





//class Vehicle{
//    void cost(int price){
//        System.out.println("Cost of the vehicle is = "+price);
//    }
//}
//class Bus extends Vehicle{
//    int capacity;
//    void display(){
//        System.out.println("capacity = " + capacity);
//    }
//}
//class Train extends Vehicle{
//    int speed;
//    void display(){
//        System.out.println("speed = " + speed);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Bus b1 = new Bus();
//        b1.capacity = 20;
//        b1.cost(100);
//        b1.display();
//        Train t1 = new Train();
//        t1.speed = 100;
//        t1.cost(200);
//        t1.display();
//    }
//}