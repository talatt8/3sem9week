/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenumber;

/**
 *
 * @author HP
 */
public class PrimeNumber {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 100 are:");
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            // check divisibility
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // not a prime, stop checking
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
