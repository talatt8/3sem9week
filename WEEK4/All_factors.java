/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package all_factors;

import java.util.Scanner;
public class All_factors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factors of " + num + " are:");
        // Loop from 1 to num
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {   // check divisor
                System.out.print(i + " ");
            }
        }
    }
}
