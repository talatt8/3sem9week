/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swaparray;

/**
 *
 * @author HP
 */
public class SwapArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Example array
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Swap first and last elements
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        System.out.println("\nArray after swapping first and last elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
