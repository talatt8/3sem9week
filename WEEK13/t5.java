//Write a java program to find total no. of lines in a file. 
package week13;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.*;
//public class t5 {
//    public static void main(String[] args) throws Exception {
//        try {
//            FileReader fr = new FileReader("abc");
//            BufferedReader br = new BufferedReader(fr);
//            String a = br.readLine();
//            int count = 0;
//            while (a != null) {
//                count++;
//                a = br.readLine();
//            }
//            System.out.println("Number of lines:"+count);
//            br.close();
//        } catch (Exception e) {
//            System.out.println("An error occurred.");
//        }
//    }
//}
import java.io.*;

public class t5 {
    public static void main(String[] args) {

        String fileName = "myFile.txt";   // your file name
        int lineCount = 0;                // will store number of lines

        try {
            // BufferedReader lets us read the file line by line easily
            FileReader fr= new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            //String line;

            // readLine() returns one line as a String,
            // or null when there are no more lines (end of file)
            while ((br.readLine()) != null) {
                lineCount++;   // each time we read a non-null line, increase count
            }

            br.close();  // close the file

            System.out.println("Total number of lines: " + lineCount);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

