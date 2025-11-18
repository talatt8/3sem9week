/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swapping;

/**
 *
 * @author HP
 */
public class Swapping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=3;
        int b=2;
        System.out.println("Before Swapping:");
        System.out.println("a="+a);
        System.out.println("b="+b);
        // Swap using a temporary variable
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping:");
        System.out.println("a="+a);
        System.out.println("b="+b);
        
                
    }
    
}
