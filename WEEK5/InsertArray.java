/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertarray;

/**
 *
 * @author HP
 */
public class InsertArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size = 5;  // you can change the size as needed
        int[] arr = new int[size];
        // Insert 10, 20, 30...
        for (int i = 0; i < size; i++) {
            arr[i] = (i + 1) * 10;
        }
        // Display the array
        System.out.println("Array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
