package test;

import static filehandling.FileHandling.*;

public class FileHandlingTest {
    public static void main(String[] args) {
        //The string in the name var can be the direction of the folder where the file its going to be created.
        var fileName = "test.txt";
        //Here we use the methods to create and modify the files.
        //createFile(fileName);
        //fileWrite(fileName, "Im Writing in Java...");
        //addInfo(fileName, "Now Im Closing it..");
        //addInfo(fileName, "Bye..");
        readFile(fileName);
    }
}
