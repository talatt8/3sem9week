class Student {
    int rollNo;
    String name;
    int marks;
    static String schoolName;

    Student(int rollNo, String name, int marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    static void changeSchoolName(String newSchoolName){
        schoolName = newSchoolName;
    }

    void display(){
        System.out.println("rollNo = " + rollNo);
        System.out.println("name = " + name);
        System.out.println("marks = " + marks);
        System.out.println("school Name = " + schoolName);
        System.out.println("-----------------------");
    }
}

public class op5 {
    public static void main(String[] args) {

        // Change school name once
        Student.changeSchoolName("APS");

        // Create 2 students
        Student s1 = new Student(20, "Sam", 100);
        Student s2 = new Student(21, "Andrew", 50);

        // Display both students
        s1.display();
        s2.display();
    }
}
