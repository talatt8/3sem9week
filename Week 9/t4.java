//abstract class Account1 {
//    int ID;
//    String Acc_holder_name;
//    String Address;
//
//    Account1(int ID, String Acc_holder_name, String Address){
//        this.ID = ID;
//        this.Acc_holder_name = Acc_holder_name;
//        this.Address = Address;
//    }
//
//    abstract void deposit(int amt);
//    abstract void withdraw(int amt);
//}
//class Saving extends Account1{
//    int Min_balance;
//    Saving(int ID, String Acc_holder_name, String Address, int Min_balance) {
//        super(ID, Acc_holder_name, Address);
//        this.Min_balance = Min_balance;
//    }
//    void display(){
//        System.out.println("ID: "+ID);
//        System.out.println("Account holder name: "+Acc_holder_name);
//        System.out.println("Address: " + Address);
//        System.out.println("Minimum balance: "+Min_balance);
//    }
//    void deposit(int amt){
//        System.out.printf("Amount %d depositing..."+amt);
//    }
//    void withdraw(int amt){
//        System.out.printf("Amount %d withdrawn..."+amt);
//    }
//}
//class Current extends Account1{
//    int Max_withdrawl_limit;
//    Current(int ID, String Acc_holder_name, String Address, int Max_withdrawal_limit) {
//        super(ID, Acc_holder_name, Address);
//        this.Max_withdrawl_limit = Max_withdrawal_limit;
//    }
//    void display(){
//        System.out.println("ID: "+ID);
//        System.out.println("Account holder name: "+Acc_holder_name);
//        System.out.println("Address: " + Address);
//        System.out.println("Maximum withdrawal limit: "+Max_withdrawl_limit);
//    } void deposit(int amt){
//        System.out.printf("Amount %d depositing..."+amt);
//    }
//    void withdraw(int amt){
//        System.out.printf("Amount %d withdrawn..."+amt);
//    }
//}
//public class t4 {
//    public static void main(String[] args) {
//        Saving acc1 = new Saving(12, "Umaima", "Aligarh", 100);
//        acc1.display();
//        Current acc2 = new Current(14, "Amanda", "Allahabad", 200 );
//        acc2.display();
//    }
//}





abstract class Account1 {
    int ID;
    String Acc_holder_name;
    String Address;

    // Constructor
    Account1(int ID, String Acc_holder_name, String Address){
        this.ID = ID;
        this.Acc_holder_name = Acc_holder_name;
        this.Address = Address;
    }

    // Abstract methods
    abstract void deposit(int amt);
    abstract void withdraw(int amt);
}

// Saving Account Class
class Saving extends Account1 {
    int Min_balance;

    Saving(int ID, String Acc_holder_name, String Address, int Min_balance) {
        super(ID, Acc_holder_name, Address);
        this.Min_balance = Min_balance;
    }

    void display() {
        System.out.println("------ Saving Account Details ------");
        System.out.println("ID: " + ID);
        System.out.println("Account holder name: " + Acc_holder_name);
        System.out.println("Address: " + Address);
        System.out.println("Minimum balance: " + Min_balance);
    }

    @Override
    void deposit(int amt) {
        System.out.println("Depositing " + amt + " into Saving Account.");
    }

    @Override
    void withdraw(int amt) {
        System.out.println("Withdrawing " + amt + " from Saving Account.");
    }
}

// Current Account Class
class Current extends Account1 {
    int Max_withdrawal_limit;

    Current(int ID, String Acc_holder_name, String Address, int Max_withdrawal_limit) {
        super(ID, Acc_holder_name, Address);
        this.Max_withdrawal_limit = Max_withdrawal_limit;
    }

    void display() {
        System.out.println("------ Current Account Details ------");
        System.out.println("ID: " + ID);
        System.out.println("Account holder name: " + Acc_holder_name);
        System.out.println("Address: " + Address);
        System.out.println("Maximum withdrawal limit: " + Max_withdrawal_limit);
    }

    @Override
    void deposit(int amt) {
        System.out.println("Depositing " + amt + " into Current Account.");
    }

    @Override
    void withdraw(int amt) {
        System.out.println("Withdrawing " + amt + " from Current Account.");
    }
}

public class t4 {
    public static void main(String[] args) {

        Saving acc1 = new Saving(12, "Umaima", "Aligarh", 100);
        acc1.display();
        acc1.deposit(500);
        acc1.withdraw(200);

        System.out.println();

        Current acc2 = new Current(14, "Amanda", "Allahabad", 200);
        acc2.display();
        acc2.deposit(1000);
        acc2.withdraw(300);
    }
}

