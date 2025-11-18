/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primecheck;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class PrimeCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;  // assume number is prime
        if (num <= 1) {
            isPrime = false;  // numbers <=1 are not prime
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;  // found a divisor
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }
    }
}
