package test;
//This is the syntax to import classes from another packages.
//The * means that we import all the classes inside the package.
import com.exampleclass.*;
/*we can also import the static method using the next syntax:
import static com.exampleclass.Utility.print.
 */

public class utilityTest {
    public static void main(String[] args) {
        Utility.print("This method is imported from another package");
        //another way to import is by qualified name.
        com.exampleclass.Utility.print("This method is imported by qualified name");
    }
}
