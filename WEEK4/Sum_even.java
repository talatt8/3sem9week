/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sum_even;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Sum_even {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        // Input N
        System.out.print("Enter a number N: ");
        int N = sc.nextInt();
        int sum = 0;
        // Loop through 1 to N
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {  // check even
                sum += i;      // add to sum
            }
        }

        System.out.println("Sum of even numbers from 1 to " + N + " is: " + sum);
    }
}   

