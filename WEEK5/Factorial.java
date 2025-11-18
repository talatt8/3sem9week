/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Factorial {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long fact = 1; // factorial result (use long for large numbers)
        // Calculate factorial using loop
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        // Display result
        System.out.println("Factorial of " + n + " = " + fact);
    }
}   
