/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumarray;

/**
 *
 * @author HP
 */
public class SumArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Example array
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        // Calculate sum of array elements
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  // add each element to sum
        }
        // Display the result
        System.out.println("Sum of array elements = " + sum);
    }
}