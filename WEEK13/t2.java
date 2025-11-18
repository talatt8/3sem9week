package week13;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.*;
//public class t2 {
//    public static void main(String[] args) {
//        String filename = "XYZ";
//        try{
//            FileWriter fw1 = new FileWriter(filename);
//            fw1.write("I like java");
//            fw1.close();
//        } catch (IOException e) {
//            System.out.println("An error occured");
//        }
//    }
//}
import java.io.FileWriter;
import java.io.IOException;

public class t2 {
    public static void main(String[] args) {

        try {
            // Create a FileWriter object (this will create the file if it doesn't exist)
            FileWriter fw = new FileWriter("myFile.txt"); /*This line creates a file named myfile.txt (if not already created).
                                                            It also opens the file so we can write inside it.*/
            // Write something into the file
            fw.write("Hello, this is my first file using Java!");

            // Close the file
            fw.close();

            System.out.println("Data written successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
