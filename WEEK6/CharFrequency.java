/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package charfrequency;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class CharFrequency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        // Convert string to lowercase (optional, for ignoring case)
        str = str.toLowerCase();
        // Array to store frequency of characters (assuming ASCII)
        int[] freq = new int[256];
        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        // Print frequency
        System.out.println("\nCharacter frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " → " + freq[i]);
            }
        }
    }
}
