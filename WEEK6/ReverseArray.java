/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversearray;
/**
 *
 * @author HP
 */
public class ReverseArray {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Reverse the array
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        System.out.println("\nReversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}