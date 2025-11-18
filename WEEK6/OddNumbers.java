/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oddnumbers;

/**
 *
 * @author HP
 */
public class OddNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Odd numbers from 1 to 99 are:");
       // for (int i = 1; i <= 99; i++) {
         //   if (i % 2 != 0) {   // check if the number is odd
          //     System.out.print(i + " ");
            //}
        //}
        for (int i = 1; i <= 99; i += 2) {
            System.out.print(i + " ");
        }
    }
}
