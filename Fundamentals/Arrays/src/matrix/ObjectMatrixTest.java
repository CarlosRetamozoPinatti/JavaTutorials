package matrix;

import domain.Person;

public class ObjectMatrixTest {
    public static void main(String[] args) {
        Person persons[][] = new Person[2][3];
        persons[0][0] = new Person("John");
        persons[0][1] = new Person("Jane");
        persons[0][2] = new Person("Chuck");
        print(persons);
    }

    public static void print(Object matrix[][]) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println("Matrix " + row + "-" + col + ": " + matrix[row][col]);
            }
        }
    }
}