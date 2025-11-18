/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linearsearch;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class LinearSearch {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Input element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        // Linear Search
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                position = i; // store index
                break;
            }
        }
        // Output result
        if (position == -1) {
            System.out.println(key + " not found in the array.");
        } else {
            System.out.println(key + " found at position " + (position + 1)); // +1 for human-readable index
        }
    }
}
