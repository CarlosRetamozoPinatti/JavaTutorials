package test;
//For Each is an enhanced For cycle.

public class ForEach {
    public static void main(String[] args) {
        int ages[] = {4,5,6,7};
        //It uses a simplified syntax.
        //This form of the For Cycle cannot return/print the index of the elements.
        for(int age: ages){
            System.out.println("age = " + age);
        }
    }
}
