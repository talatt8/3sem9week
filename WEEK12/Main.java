package week12;
public class Main {
    public static int divide(int n, int d){
        return n/d;
    }
    public static void main(String[] args) {
        for(int i=5; i>=-1; i--){
            try{
                System.out.println("Dividing 10 by "+i);
                int result = divide(10,i);
                System.out.println("result = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by 0");
            }
        }
    }
}