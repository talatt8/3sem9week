/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starpattern;
/**
 *
 * @author HP
 */
public class StarPattern {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 3;  // middle row (max stars)
        // Upper part (1 to n)
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {      // print spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {     // print stars
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {      // Lower part (n-1 to 1)
            // print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}