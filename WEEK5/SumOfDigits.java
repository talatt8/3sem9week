/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumofdigits;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class SumOfDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input from user
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        // Extract digits and add
        while (temp != 0) {
            int digit = temp % 10; // get last digit
            sum += digit;          // add digit to sum
            temp /= 10;            // remove last digit
        }
        // Display result
        System.out.println("Sum of digits of " + num + " = " + sum);
    }
}  
