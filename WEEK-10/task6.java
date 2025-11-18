// Parent Class
class University {
    String name;
    int ranking;

    // Constructor to set University details
    University(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }
}

// Child Class (Inherits University)
class Faculty extends University {
    String name; // Faculty name

    // Constructor to initialize both University and Faculty
    Faculty(String universityName, int ranking, String facultyName) {
        super(universityName, ranking);  // Calling parent constructor
        this.name = facultyName;
    }

    void Details() {
        System.out.println("Faculty Name: " + name);
    }
}

// Child of Faculty (Multilevel Inheritance)
class Department extends Faculty {
    String name;      // Department name
    String chairman;  // Head of Department

    // Constructor to initialize University, Faculty, and Department
    Department(String universityName, int ranking, String facultyName, String deptName, String chairman) {
        super(universityName, ranking, facultyName);  // Calling Faculty constructor
        this.name = deptName;
        this.chairman = chairman;
    }

    // Department Details method
    void Details() {
        System.out.println("Department Name: " + name);
        System.out.println("Chairman: " + chairman);
    }

    // Display method calls Details of both Faculty & Department
    void Display() {
        super.Details(); // Calling Faculty Details()
        Details();       // Calling Department Details()
    }
}

// Main Class to Execute
public class task6 {
    public static void main(String[] args) {

        // Creating object of Department
        Department dept = new Department("Oxford University", 1, "Engineering Faculty", "Computer Science", "Dr. John Smith");

        // Calling Display method
        dept.Display();

        // Displaying University Ranking
        System.out.println("University Ranking: " + dept.ranking);
    }
}

