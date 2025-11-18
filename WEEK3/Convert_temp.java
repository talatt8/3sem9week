/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convert_temp;

/**
 *
 * @author HP
 */
public class Convert_temp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double celcius= 27.0;
        //Conversion formula: F=(C x 9/5)+32
        double fahrenheit=(celcius*9/5)+32;
        System.out.println("Celcius: "+celcius + "°C");
        System.out.println("Fahrenheit: "+fahrenheit+"°F");
    }
    
}
