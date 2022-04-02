package test;

import java.util.*;

public class GenericsAPITest {
    public static void main(String[] args) {
        //Here we declare the String type. Like we did in Collections.
        //This fastens the Compilation Time.
        List<String> myList = new ArrayList<>();
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");
        myList.add("Saturday");
        myList.add("Sunday");
        String element = myList.get(0);
        System.out.println("element = " + element);
        print(myList);
    //It works the same way for Set and Map.
    }
    //Here we declare the type the collection should use.
    public static void print(Collection<String> collection){
         for (Object element: collection){
             System.out.println("element = " + element);
         }


    }
}
