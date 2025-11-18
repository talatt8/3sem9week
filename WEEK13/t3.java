package week13;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.util.*;
//public class t3 {
//    public static void main(String[] args) throws FileNotFoundException {
//        try {
//            FileReader fr = new FileReader("abc");
//            FileWriter fw = new FileWriter("XYZ");
//            int c = fr.read();
//            while (c >= 0) {
//                fw.write((char) c);
//                c = fr.read();
//            }
//            fr.close();
//            fw.close();
//        } catch (Exception e) {
//            System.out.println("an error occurred");
//        }
//    }
//}
import java.io.*;

public class t3 {
    public static void main(String[] args) {
        String sourceFile = "myFile.txt";
        String destinationFile = "copiedFile.txt";

        try {
            FileReader fr = new FileReader(sourceFile);
            FileWriter fw = new FileWriter(destinationFile);

            int ch;
            while ((ch =fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

                        //APPEND MODE:
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class t3 {
//    public static void main(String[] args) {
//
//        try {
//            // FileWriter in append mode (true means add to existing file)
//            FileWriter fw = new FileWriter("myfile.txt", true);
//
//            // Write text at the end of the file
//            fw.write("\nThis text is added at the end of the file.\n");
//
//            // Close the file
//            fw.close();
//
//            System.out.println("Data appended successfully!");
//
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//        }
//    }
//}
