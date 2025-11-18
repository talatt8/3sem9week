/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxminarray;

/**
 *
 * @author HP
 */
public class MaxMinArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {25, 11, 7, 75, 56}; // Example array
        int max = arr[0]; // assume first element is max
        int min = arr[0]; // assume first element is min
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // update maximum
            }
            if (arr[i] < min) {
                min = arr[i];  // update minimum
            }
        }
        System.out.println("Maximum element = " + max);
        System.out.println("Minimum element = " + min);
    }
}
