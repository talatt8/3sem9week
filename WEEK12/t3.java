package week12;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
class BankAcc{
    double balance;
    String acc_holder_name;

    BankAcc(double balance, String acc_holder_name){
        this.balance = balance;
        this.acc_holder_name = acc_holder_name;
    }
    void withdraw(int amount) throws InsufficientFundsException{
        if(amount>balance){
            throw new InsufficientFundsException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
    /*void deposit(double amount){
        balance += amount;
    }
    public double getBalance() {
        return balance;
    }*/
}
public class t3 {
    public static void main(String[] args) {
        BankAcc b = new BankAcc(5000, "Umaima");
        try{
            b.withdraw(4000);
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}


//// Custom Exception (when money is not enough)
//class InsufficientFundsException extends Exception {
//    InsufficientFundsException(String msg) {
//        super(msg);
//    }
//}
//
//// Bank Account class
//class BankAccount {
//    double balance;
//
//    BankAccount(double balance) {
//        this.balance = balance;
//    }
//
//    // Withdraw method
//    void withdraw(double amount) throws InsufficientFundsException {
//        if (amount > balance) {
//            throw new InsufficientFundsException("Balance is too low!");
//        }
//        balance = balance - amount;
//        System.out.println("Withdraw successful. New balance: " + balance);
//    }
//}
//
//public class t3 {
//    public static void main(String[] args) {
//
//        BankAccount b = new BankAccount(5000);   // starting balance = 5000
//
//        try {
//            b.withdraw(4000);   // trying to withdraw more than we have
//        } 
//        catch (InsufficientFundsException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//
//        System.out.println("Program ended.");
//    }
//}
