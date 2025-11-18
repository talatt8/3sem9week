/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package largestelement;

/**
 *
 * @author HP
 */
public class LargestElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Example array
        int[] arr = {25, 47, 89, 12, 56};
        int largest = arr[0]; // assume first element is largest
        // Compare each element with current largest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        // Display result
        System.out.println("The largest element in the array is: " + largest);
    }
}    
