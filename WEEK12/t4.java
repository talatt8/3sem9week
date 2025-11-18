package week12;
class InvalidAgeException1 extends Exception{
    public InvalidAgeException1(String message){
        super(message);
    }
}
public class t4 {
    public static void checkAge(int age) throws InvalidAgeException1{
        if(age<18){
            throw new InvalidAgeException1("Age should be 18 or above.");
        }
        System.out.println("Access granted. Age is valid: " + age);
    }
    public static void main(String[] args) {
        int personAge = 16;
        try{
            checkAge(personAge);
        }
        catch (InvalidAgeException1 e){
            System.out.println("Access denied "+ e.getMessage());
        }
    }
}
