//class Account{
//    int ID;
//    String Acc_holder_name;
//    String Address;
//
//    void deposit(int amt){
//        System.out.println("Amount %d depositing..."+amt);
//    }
//    void withdraw(int amt){
//        System.out.println("Amount %d withdrawn..."+amt);
//    }
//    static void calculateSimpleInterest(double P, double R, int T){
//        double interest = (P*R*T)/100;
//        System.out.println("Simple interest = " + interest);
//    }
//    static void calculateCompoundInterest(double P, double R, int timesCompoundedPerYear, int T) {
//            double amount = P * Math.pow(1 + R / timesCompoundedPerYear, timesCompoundedPerYear * T);
//            double CI = amount - P;
//            System.out.println("Compound Interest = " + CI);
//    }
//}
//public class t3 {
//    public static void main(String[] args) {
//        Account a1 = new Account();
//        Account.calculateSimpleInterest(200, 5, 1);// can call static method without creating an object
//        Account.calculateCompoundInterest(200, 5, 2, 1);
//        a1.deposit(500);
//        a1.withdraw(50);
//    }
//}


class Account {
    int ID;
    String accountHolderName;
    String address;

    // Method to deposit money
    void deposit(int amount) {
        System.out.println("Amount " + amount + " deposited successfully.");
    }

    // Method to withdraw money
    void withdraw(int amount) {
        System.out.println("Amount " + amount + " withdrawn successfully.");
    }

    // Static method to calculate simple interest
    static void calculateSimpleInterest(double P, double R, int T) {
        double interest = (P * R * T) / 100;
        System.out.println("Simple Interest = " + interest);
    }

    // Static method to calculate compound interest
    static void calculateCompoundInterest(double P, double R, int n, int T) {
        // R must be divided by 100 to convert percentage into decimal
        double amount = P * Math.pow(1 + (R/ n), n * T);
        double CI = amount - P;
        System.out.println("Compound Interest = " + CI);
    }
}

public class t3 {
    public static void main(String[] args) {

        // Creating account object
        Account a1 = new Account();

        // Calling static methods without object
        Account.calculateSimpleInterest(10000, 5, 2);
        Account.calculateCompoundInterest(10000, 5, 2, 2);

        // Calling deposit & withdraw using object
        a1.deposit(500);
        a1.withdraw(200);
    }
}
