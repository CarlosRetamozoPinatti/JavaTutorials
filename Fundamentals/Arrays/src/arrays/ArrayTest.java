package arrays;

public class ArrayTest {
    public static void main(String[] args) {
        //an array is an Object-type structure with a fixed number of elements.
        int ages[] = new int[4];
        System.out.println("ages = " + ages);
        //to modify the values of the array, we call the variable and the index number.
        ages[0] = 10;
        System.out.println("ages 0 = " + ages[0]);
        ages[1] = 12;
        System.out.println("ages 1 = " + ages[1]);
        ages[2] = 15;
        System.out.println("ages 2 = " + ages[2]);
        ages[3] = 7;
        System.out.println("ages 3 = " + ages[3]);
        //using an index out of range raises up a runtime error.
        //ages[5] = 13;
        //System.out.println("ages 5 = " + ages[5]);

        //making a For cycle to iterate all values of the Array.
        for (int i = 0; i < ages.length; i++){
            System.out.println("ages index " + i + ": " + ages[i]);
        }

    }
}
