// Outer Class
class Employee {
    String empName;
    int empId;

    // Constructor to initialize Employee
    Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    // Inner Class 1 - Salary
    class Salary {
        double basic, hra, pf;

        Salary(double basic, double hra, double pf) {
            this.basic = basic;
            this.hra = hra;
            this.pf = pf;
        }

        void displaySalary() {
            System.out.println("Salary Details:");
            System.out.println("Basic: " + basic);
            System.out.println("HRA: " + hra);
            System.out.println("PF: " + pf);
        }
    }

    // Inner Class 2 - Joining Date
    class JoiningDate {
        int day, month, year;

        JoiningDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        void displayJoiningDate() {
            System.out.println("Joining Date: " + day + "/" + month + "/" + year);
        }
    }

    // Method to Display all Employee Details
    void displayEmployee() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
    }
}

// Main Class to Test
public class task7 {
    public static void main(String[] args) {

        // Creating Employee object
        Employee emp = new Employee("John Doe", 101);

        // Creating Inner Class objects
        Employee.Salary salary = emp.new Salary(30000, 8000, 2000);
        Employee.JoiningDate joinDate = emp.new JoiningDate(15, 8, 2022);

        // Display details
        emp.displayEmployee();
        salary.displaySalary();
        joinDate.displayJoiningDate();
    }
}
// Outer Class
//class Employee {
//    String empName;
//    int empId;
//
//    Salary salary;          // Object of inner class Salary
//    JoiningDate joiningDate; // Object of inner class JoiningDate
//
//    // Constructor to initialize Employee
//    Employee(String empName, int empId, double basic, double hra, double pf,
//             int day, int month, int year) {
//
//        this.empName = empName;
//        this.empId = empId;
//
//        // Creating objects of inner classes
//        this.salary = new Salary(basic, hra, pf);
//        this.joiningDate = new JoiningDate(day, month, year);
//    }
//
//    // Inner Class 1 - Salary
//    class Salary {
//        double basic, hra, pf;
//
//        Salary(double basic, double hra, double pf) {
//            this.basic = basic;
//            this.hra = hra;
//            this.pf = pf;
//        }
//
//        void displaySalary() {
//            System.out.println("Salary Details:");
//            System.out.println("Basic: " + basic);
//            System.out.println("HRA: " + hra);
//            System.out.println("PF: " + pf);
//        }
//    }
//
//    // Inner Class 2 - Joining Date
//    class JoiningDate {
//        int day, month, year;
//
//        JoiningDate(int day, int month, int year) {
//            this.day = day;
//            this.month = month;
//            this.year = year;
//        }
//
//        void displayJoiningDate() {
//            System.out.println("Joining Date: " + day + "/" + month + "/" + year);
//        }
//    }
//
//    // Method to Display all Employee Details
//    void displayEmployee() {
//        System.out.println("Employee Name: " + empName);
//        System.out.println("Employee ID: " + empId);
//        System.out.println();
//        salary.displaySalary(); // Calling inner class method
//        System.out.println();
//        joiningDate.displayJoiningDate(); // Calling inner class method
//    }
//}
//
//// Main Class to Test
//public class task7 {
//    public static void main(String[] args) {
//
//        // Creating Employee object with all details
//        Employee emp = new Employee("John Doe", 101,
//                30000, 8000, 2000,
//                15, 8, 2022);
//
//        // Display all employee details
//        emp.displayEmployee();
//    }
//}
