/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smallest_num;

/**
 *
 * @author HP
 */
public class Smallest_num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 5, b = 10, c = 4, d = 8;  // we can change values here
        // Assume 'a' is smallest first
        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }
        if (d < smallest) {
            smallest = d;
        }
        System.out.println("The smallest number is: " + smallest);
    }
}   
