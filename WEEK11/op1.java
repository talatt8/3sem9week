package week11;
interface Printer{
    void connect();
    default void details(){
        System.out.println("Printer - An output device.");
    }
}
interface Scanner{
    void connect();
    default void details(){
        System.out.println("Scanner - An input device.");
    }
}
class MultiFunctionMachine implements Printer, Scanner{
    public void connect(){
        System.out.println("Connecting...");
    }
    public void details(){
        System.out.println("Having both functions of:");
        Printer.super.details();
        Scanner.super.details();
    }
}
public class op1 {
    public static void main(String[] args) {
        MultiFunctionMachine m = new MultiFunctionMachine();
        m.connect();
        m.details();
    }
}
