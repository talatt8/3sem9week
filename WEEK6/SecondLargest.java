/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secondlargest;

/**
 *
 * @author HP
 */
public class SecondLargest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {10, 25, 3, 45, 60, 12, 90, 72};
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > firstLargest) {
                // Update both first and second largest
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                // Update only second largest
                secondLargest = num;
            }
        }
        System.out.println("The second largest element is: " + secondLargest);
    }
}    
