package test;

import java.util.*;
/*
The List interface in Java provides a way to store the ordered collection.
It is a child interface of Collection.
It is an ordered collection of objects in which duplicate values can be stored.
Since List preserves the insertion order, it allows positional access and insertion of elements.
It can store any kind of Object type, and it doesn't need to be declared, but we do it for good practice.

The ArrayList class is a resizable array, which can be found in the java.util package.
The difference between a built-in array and an ArrayList in Java
is that the size of an array cannot be modified
(if you want to add or remove elements to/from an array, you have to create a new one).
While elements can be added and removed from an ArrayList whenever you want.
The syntax is also slightly different.
 */
public class CollectionsTest {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");
        myList.add("Saturday");
        myList.add("Sunday");
        /*
        The next syntax is a Lambda Expression.
        A lambda expression is a short block of code which takes in parameters and returns a value.
        Lambda expressions are similar to methods, but they do not need a name.
        They can be implemented right in the body of a method.
         */
        myList.forEach(element -> System.out.println("element = " + element));

        /*
        The set interface is present in java.util package and extends the Collection interface.
        It's an unordered collection of objects in which duplicate values cannot be stored.
        It's an interface that implements the mathematical set.
        This interface contains the methods inherited from the Collection interface
        and adds a feature that restricts the insertion of the duplicate elements.
        It can store any kind of Object type, and it doesn't need to be declared, but we do it for good practice.
         */
        Set<String> mySet = new HashSet<>();
        mySet.add("Monday");
        mySet.add("Tuesday");
        mySet.add("Wednesday");
        mySet.add("Thursday");
        mySet.add("Friday");
        mySet.add("Saturday");
        mySet.add("Sunday");

        print(mySet);

        /*
        A map contains values on the basis of key, i.e. key and value pair.
        Each key and value pair is known as an entry. A Map contains unique keys.
        A Map is useful if you have to search, update or delete elements on the basis of a key.
         */
        Map<String, String> myMap = new HashMap();
        myMap.put("Value1", "John");
        myMap.put("Value2", "Anna");
        myMap.put("Value3", "Marie");

        String element = myMap.get("Value1");
        System.out.println("element = " + element);

        print(myMap.keySet());
        print(myMap.values());

    }

    public static void print(Collection collection){
         for (Object element: collection){
             System.out.println("element = " + element);
         }
    }
}
