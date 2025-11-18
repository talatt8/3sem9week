// Parent Class
class ObjectOriented {

    void abstraction() {
        System.out.println("hiding implementation details.");
    }

    void polymorphism() {
        System.out.println("many forms.");
    }

    void inheritance() {
        System.out.println("one class to acquire properties of another class.");
    }
}

// Child Class
class JavaLanguage extends ObjectOriented {

    void persistence() {
        System.out.println("storing data permanently (like in files or databases).");
    }

    void interfaces() {
        System.out.println("Interfaces provide 100% abstraction in Java.");
    }
}

// Main Class to run the program
public class task4 {
    public static void main(String[] args) {

        // Creating object of JavaLanguage class
        JavaLanguage java = new JavaLanguage();

        // Accessing parent class methods
        java.abstraction();
        java.polymorphism();
        java.inheritance();

        // Accessing own methods
        java.persistence();
        java.interfaces();
    }
}

