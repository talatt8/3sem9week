/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberpattern;

/**
 *
 * @author HP
 */
public class NumberPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows = 5;  // number of rows
        for (int i = 1; i <= rows; i++) {   // loop for rows
            for (int j = 1; j <= i; j++) { // loop for numbers in each row
                System.out.print(j);
            }
            System.out.println(); // move to next line after each row
        }
    }
}