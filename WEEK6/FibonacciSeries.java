/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacciseries;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class FibonacciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input from user
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int first = 0, second = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            // calculate next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
}   