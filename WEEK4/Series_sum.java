/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package series_sum;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Series_sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a value for N:");
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int sum = 0;
        for(int i = 1; i<=N; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
    
}
