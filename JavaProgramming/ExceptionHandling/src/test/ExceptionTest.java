package test;

import exceptions.ExceptionOperations;
import maths.Maths;

import static maths.Maths.divide;

/*
An exception is a problem that arises during the execution of a program.
When an Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally, which is not recommended, therefore, these exceptions are to be handled.
An exception can occur for different reasons. Following are some scenarios where an exception occurs.
    -   A user has entered an invalid data.
    -   A file that needs to be opened cannot be found.
    -   A network connection has been lost in the middle of communications or the JVM has run out of memory.
Some of these exceptions are caused by user error, others by programmer error, and others by physical resources that have failed in some manner.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int result = 0;
        /*The Syntax consist in two parts:
        Try - the action we want to do.
        Catch - the alternative response in case the action cannot be done.
         */

        try {
            result = divide(10, 0);
        }
        //we can have multiple catch blocks for exceptions, sorted by hierarchy, from lowest to highest.
        catch (ExceptionOperations e){
            System.out.println("AN ExceptionOperations ERROR OCCURRED: " + e.getMessage());
        }
        catch (Exception e){
            //e.printStackTrace(System.out);
            //This line prints out the Exception message alone, without the text wall.
            System.out.println("AN ERROR OCCURRED: " + e.getMessage());
        }
        //"Finally" is a block that ALWAYS executes.
        finally {
            System.out.println("Operation has been revised");
        }
        System.out.println("result = " + result);
    }

}
//USING RUNTIME EXCEPTIONS WE DONT NEED TO USE THE TRY-CATCH.