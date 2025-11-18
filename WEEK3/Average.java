/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package average;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Number: ");
        double num1= sc.nextDouble();
        System.out.println("Enter the 2nd Number: ");
        double num2= sc.nextDouble();
        System.out.println("Enter the 3rd Number: ");
        double num3= sc.nextDouble();
        double avg=(num1+num2+num3)/3;
        System.out.println("The Average is:  "+avg);
        sc.close();
        
        
    }
    
}
