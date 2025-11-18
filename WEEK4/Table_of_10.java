/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package table_of_10;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Table_of_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        System.out.println("Table of 10 :");
        for(int i = 1; i <= 10; i++){
            int product = a*i;
            System.out.println(a + "x" + i + "=" + product);
        }
    }   
}
