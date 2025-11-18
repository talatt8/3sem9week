package week11;
//interface Account{
//    void deposit();
//    void withdraw();
//    static void aboutbank(){
//        System.out.println("Bank info...");
//    }
//    default void takeloan(){
//        System.out.println("Loan facility not available...");
//    }
//}
//class Saving implements Account{
//    public void deposit(){
//        System.out.println("Enter amount to deposit");
//    }
//    public void withdraw(){
//        System.out.println("Enter amount to withdraw");
//    }
//    public void takeloan(){
//        System.out.println("Taking loan...");
//    }
//}
//class Current implements Account{
//    public void deposit(){
//        System.out.println("Enter amount to deposit");
//    }
//    public void withdraw(){
//        System.out.println("Enter amount to withdraw");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//    Current c = new Current();
//    c.deposit();
//    c.withdraw();
//    Account.aboutbank();
//    Saving s = new Saving();
//    s.deposit();
//    s.withdraw();
//    s.takeloan();
//    }
//}


// Interface
interface Account {

    // Abstract methods (must be implemented by classes)
    void deposit();
    void withdraw();

    // Static Method
    static void aboutBank() {
        System.out.println("This is ABC Bank. We provide Saving and Current accounts.");
    }

    // Default Method (will be implemented only by Saving class)
    default void takeLoan() {
        System.out.println("Loan facility is available only for Saving Account.");
    }
}

// Saving Class
class Saving implements Account {

    public void deposit() {
        System.out.println("Saving Account: Deposit successful.");
    }

    public void withdraw() {
        System.out.println("Saving Account: Withdraw successful.");
    }

    // Overriding default method
    public void takeLoan() {
        System.out.println("Saving Account: Loan approved.");
    }
}

// Current Class
class Current implements Account {

    public void deposit() {
        System.out.println("Current Account: Deposit successful.");
    }

    public void withdraw() {
        System.out.println("Current Account: Withdraw successful.");
    }

    // Current class does NOT override takeLoan()
    // so default method from interface will run
}

public class Main {
    public static void main(String[] args) {

        // Calling static method of Interface
        Account.aboutBank();

        // Creating Saving object
        Saving s = new Saving();
        s.deposit();
        s.withdraw();
        s.takeLoan();  // Saving class overridden method runs

        // Creating Current object
        Current c = new Current();
        c.deposit();
        c.withdraw();
        c.takeLoan();  // Interface default method runs
    }
}
