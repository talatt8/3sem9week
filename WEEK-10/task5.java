// Parent Class
class ObjectOrienteD {

    void abstraction() {
        System.out.println("Abstraction allows hiding complex implementation details.");
    }

    void polymorphism() {
        System.out.println("Polymorphism allows one name to have many forms.");
    }

    void inheritance() {
        System.out.println("Inheritance allows one class to acquire properties of another class.");
    }
}

// Child Class 1 - JavaLanguage
class JavaLanguagE extends ObjectOrienteD {

    void persistence() {
        System.out.println("Persistence means storing data permanently (like in files or databases).");
    }

    void interfaces() {
        System.out.println("Interfaces provide 100% abstraction in Java.");
    }
}

// Child Class 2 - CPlusPlus
class CPlusPlus extends ObjectOrienteD {

    void template() {
        System.out.println("writing generic functions and classes in C++.");
    }

    void friendFunction() {
        System.out.println("access private members of a class in C++.");
    }
}

// Main Class to run the program
public class task5 {
    public static void main(String[] args) {

        // Creating object of JavaLanguage class
        JavaLanguagE java = new JavaLanguagE();
        System.out.println("=== Methods of JavaLanguage Object ===");
        java.abstraction();
        java.polymorphism();
        java.inheritance();
        java.persistence();
        java.interfaces();

        System.out.println();

        // Creating object of CPlusPlus class
        CPlusPlus cpp = new CPlusPlus();
        System.out.println("=== Methods of CPlusPlus Object ===");
        cpp.abstraction();
        cpp.polymorphism();
        cpp.inheritance();
        cpp.template();
        cpp.friendFunction();
    }
}

