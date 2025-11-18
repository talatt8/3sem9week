package week11;
interface Bike{
    void offer();
    default void details(){
        System.out.println("Bike details are..");
    }
}
interface Scooty{
    void offer();
    default void details(){
        System.out.println("Scooty details are...");
    }
}
class BuySomething implements Bike, Scooty{
   public void offer(){
       System.out.println("Offers are..");
   }
   public void details(){
       Bike.super.details();
       Scooty.super.details();
   }
}
public class t3 {
    public static void main(String[] args) {
        BuySomething b = new BuySomething();
        b.offer();
        b.details();
    }
}
