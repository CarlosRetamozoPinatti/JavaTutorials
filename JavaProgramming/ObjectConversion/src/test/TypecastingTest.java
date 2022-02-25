package test;
/*
A process of converting one data type to another is known as Typecasting.
Upcasting and Downcasting is the type of object typecasting.
Parent and Child objects are two types of objects.
There are two types of typecasting possible for an object: Parent to Child and Child to Parent or can say Upcasting and Downcasting.
 */

import domain.Employee;
import domain.Writer;
import domain.WritingType;

public class TypecastingTest {
    public static void main(String[] args) {
        //Here we upcast the reference. Father Class uses the references of Daughter Class.
        Employee employee;
        //The variable is using the Child class, so the getDetails() method will be the one of the Child class.
        employee = new Writer("Jake", 3000, WritingType.CLASSIC);
        System.out.println(employee.getDetails());
        //We cannot use employee.getWritingType() because it's only defined in the Child class, not both Parent and Child.
        //To access the method, we need to convert the employee to Writer type.
        //This is an example of Downcast.
        ((Writer)employee).getWritingType();
        //Another Syntax.
        Writer writer = (Writer) employee;
        writer.getWritingType();


    }
}
