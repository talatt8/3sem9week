/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divide_by_2;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Divide_by_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a number:");
        Scanner s = new Scanner(System.in);
        double num = s.nextDouble();
        while(num>10){
            num = num / 2;
            System.out.println(num);
        }
    }    
}
