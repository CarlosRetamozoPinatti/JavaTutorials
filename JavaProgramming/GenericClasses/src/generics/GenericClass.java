package generics;
/*
Generics means parameterized types.
The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces.
Using Generics, it is possible to create classes that work with different data types.
An entity such as class, interface, or method that operates on a parameterized type is a generic entity.
 */
public class GenericClass<T> {
    T object;

    public GenericClass(T object){
        this.object = object;
    }

    public void getType(){
        System.out.println("T type is: " + object.getClass().getSimpleName());
    }
}
