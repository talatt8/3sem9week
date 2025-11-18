/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decimalhexconversion;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class DecimalHexConversion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Decimal to Hexadecimal
        System.out.print("Enter a Decimal number: ");
        int decimal = sc.nextInt();
        String hex = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hexadecimal of " + decimal + " = " + hex);
        // Hexadecimal to Decimal
        System.out.print("Enter a Hexadecimal number: ");
        String hexInput = sc.next();
        int decValue = Integer.parseInt(hexInput, 16);
        System.out.println("Decimal of " + hexInput + " = " + decValue);
    }
}
