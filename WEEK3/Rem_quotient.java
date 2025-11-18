/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rem_quotient;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Rem_quotient {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        int dividend= sc.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor= sc.nextInt();
        int quotient= dividend/divisor;
        int remainder= dividend % divisor;
        System.out.println("Quotient: "+quotient);
        System.out.println("Remainder: "+remainder);
        
    }
}
