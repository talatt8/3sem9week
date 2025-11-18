package week12;
//class InvalidAgeException extends Exception{
//    public InvalidAgeException(String message){
//        super(message);
//    }
//}
//public class t2 {
//    public static void validateAge(int age) throws InvalidAgeException {
//        if (age < 18 || age > 100) {
//            throw new InvalidAgeException("Age should be between 18 and 100.");
//        }
//        System.out.println("Age is valid: " + age);
//    }
//
//    public static void processAge(int age) throws InvalidAgeException {
//        validateAge(age);
//    }
//
//    public static void main(String[] args) {
//        int userAge = 15;
//        try {
//            processAge(userAge);
//        } catch (InvalidAgeException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//}


class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class t2{

    // 3rd function → Exception occurs here
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above!");
        }
        System.out.println("Age is valid.");
    }

    // 2nd function → Using throws (just passing exception)
    static void middleFunction(int age) throws InvalidAgeException {
        checkAge(age);
    }

    public static void main(String[] args) {

        // 1st function → Handling exception using try-catch
        try {
            middleFunction(15);    // passing age
        } catch (InvalidAgeException e) {
            System.out.println("Error handled in main: " + e.getMessage());
        }
    }
}
