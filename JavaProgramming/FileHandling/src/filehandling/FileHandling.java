package filehandling;

/*
In Java, a File is an abstract data type.
A named location used to store related information is known as a File.
There are several File Operations like creating a new File,
getting information about File,
writing into a File,
reading from a File and deleting a File.
Before understanding the File operations, it is required that we should have knowledge of Stream and File methods.
If you have knowledge about both of them, you can skip it.
 */

import java.io.*;
//Here is the method used to create the file
public class FileHandling {
    public static void createFile(String fileName){
        File file = new File(fileName);
        try {
            PrintWriter output = new PrintWriter(file);
            output.close();
            System.out.println("File was created..");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }
//Here is the method used to write something in the file
    public static void fileWrite(String fileName, String content){
        File file = new File(fileName);
        try {
            PrintWriter output = new PrintWriter(file);
            output.println(content);
            output.close();
            System.out.println("File was written..");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }
//Here is the method to add something without overwriting in the file
    public static void addInfo(String fileName, String content){
        File file = new File(fileName);
        try {
            PrintWriter output = new PrintWriter(new FileWriter(file, true));
            output.println(content);
            output.close();
            System.out.println("Information was added..");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
//Here is the method to read the file
    public static void readFile(String fileName){
        var file = new File(fileName);
        try {
            var input = new BufferedReader(new FileReader(file));
            var reading = input.readLine();
            while (reading != null){
                System.out.println("I'm reading = " + reading);
                reading = input.readLine();
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
