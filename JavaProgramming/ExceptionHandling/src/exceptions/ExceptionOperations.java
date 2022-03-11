package exceptions;
/*
We have two categories of Exceptions. You need to understand them to know how exception handling works in Java.
    *   Checked exceptions − A checked exception is an exception that is checked (notified) by the compiler at compilation-time
     These are also called as compile time exceptions.
     These exceptions cannot simply be ignored, the programmer should take care of (handle) these exceptions.

    *   Unchecked exceptions − An unchecked exception is an exception that occurs at the time of execution.
    These are also called as Runtime Exceptions.
    These include programming bugs, such as logic errors or improper use of an API.
    Runtime exceptions are ignored at the time of compilation.
 */
public class ExceptionOperations extends RuntimeException {
    public ExceptionOperations(String message){
        super(message);
    }
}
