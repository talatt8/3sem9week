class Employee{
    String name;
    int salary;
    
    void showDetails(){
        System.out.println("name = " + name);
        System.out.println("salary = " + salary);
    }
}
class Manager extends Employee{
    String department;
    @Override
    void showDetails(){
        System.out.println("name = " + name);
        System.out.println("salary = " + salary);
        System.out.println("department = " + department);
    }
}
public class op2 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Mary";
        m.salary = 7000;
        m.department = "HR";
        m.showDetails();
    }
}
