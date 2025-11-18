/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromenumber;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class PalindromeNumber {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int reversed = 0;
        // Reverse the number
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        // Check palindrome
        if (num == reversed) {
            System.out.println(num + " is a Palindrome number.");
        } else {
            System.out.println(num + " is NOT a Palindrome number.");
        }
    }
}  
