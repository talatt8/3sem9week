package week13;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.*;
//public class t4 {
//    public static void main(String[] args) throws FileNotFoundException {
//        try {
//            FileReader fr = new FileReader("abc");
//            int c = fr.read();
//            int count = 0;
//            while (c >= 0) {
//                count++;
//                c = fr.read();
//            }
//            fr.close();
//            System.out.println("Number of characters:"+ count);
//        } catch(Exception e){
//            System.out.println("An error occurred");
//        }
//    }
//}
import java.io.*;

public class t4{
    public static void main(String[] args) {

        String fileName = "myFile.txt";   // your file name
        int count = 0;                    // to count characters

        try {
            FileReader fr = new FileReader(fileName);  // open your file

            //int ch;

            // Read each character until the end of the file
            while ((fr.read()) != -1) {
                count++;   // increase count for every character
            }

            fr.close();  // close the file

            System.out.println("Total number of characters: " + count);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

