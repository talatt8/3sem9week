/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package largest_num;

/**
 *
 * @author HP
 */
public class Largest_num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 2;
        int b = 5;
        int c = 0;
        // finding the largest of the three numbers
//        if(a>b) {
//            if (a > c)
//                System.out.println(a + " is the largest number");
//            else
//                System.out.println(b + " is the largest number");
//            
//        } else
//            if(b>c)
//                System.out.println(b + " is the largest number");
//            else
//                System.out.println(c + " is the largest number");
                            //OR we can do:
          if(a>b && a>c)
              System.out.println(a + " is the largest number");
          else if(b>a && b>c)
              System.out.println(b + " is the largest number");
          else
              System.out.println(c + " is the largest number");
    }    
}
