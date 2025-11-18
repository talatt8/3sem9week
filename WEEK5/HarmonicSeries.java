/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package harmonicseries;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class HarmonicSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input from user
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        double sum = 0.0;
        // Calculate the series sum
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;  // use 1.0 to get decimal result
        }
        // Display result
        System.out.println("Sum of the series = " + sum);
    }
}  
