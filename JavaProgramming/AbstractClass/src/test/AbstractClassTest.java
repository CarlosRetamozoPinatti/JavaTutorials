package test;

import domain.GeometricFigure;
import domain.Rectangle;

//We cannot create objects based on an abstract class.
//Abstract classes cannot be instantiated.
//So, in order to execute the test, we instantiate a child class.
/*Here happens two things:
    first, thanks to Upcasting, we can assign a child type to a parent type.
    second, we use polymorphism to access the method of the child class.
 */
public class AbstractClassTest {
    public static void main(String[] args) {
        GeometricFigure figure = new Rectangle("Rectangle");
        figure.draw();

    }
}
