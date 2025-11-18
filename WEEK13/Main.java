package week13;
//import java.io.FileWriter;
//import java.io.IOException;
////import java.util.*;
//public class Main {
//    public static void main(String[] args) throws Exception{
//    String filename = "abc";
//    try{
//        FileWriter fw = new FileWriter(filename);
//        fw.close();
//    } catch (IOException e) {
//        System.out.println("An error occurred");
//    }
//    }
//}
//import java.io.File;
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) {
//
//        // Create a File object with the file name
//        File myFile = new File("mynewfile.txt");
//
//        try {
//            // createNewFile() tries to create the file and returns true if successful
//            if (myFile.createNewFile()) {
//                System.out.println("File created successfully: " + myFile.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } 
//        catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//    }
//}
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File myFile = new File("myNewfile.txt");

        try {
            if (myFile.createNewFile()) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

