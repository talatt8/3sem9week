/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package allprimenumbers;

/**
 *
 * @author HP
 */
public class AllPrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 100 are:");
        for (int num = 2; num <= 100; num++) { // start from 2, since 0 and 1 are not prime
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {  // if divisible, not prime
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
