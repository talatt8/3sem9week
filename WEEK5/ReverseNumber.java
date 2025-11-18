/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversenumber;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class ReverseNumber {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int reversed = 0;
        int temp = num;
        // Reverse logic
        while (temp != 0) {
            int digit = temp % 10;      // get last digit
            reversed = reversed * 10 + digit; // add digit in reverse order
            temp /= 10;                 // remove last digit
        }
        // Output
        System.out.println("Reversed number = " + reversed);
    }
}   
