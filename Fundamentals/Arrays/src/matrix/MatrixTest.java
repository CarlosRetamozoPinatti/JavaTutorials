package matrix;
//A Matrix is a 2D arrays conformed by rows and columns.
//The index of the objects are like this: [rows][columns]
/*
An example of a matrix [3][2]
[0]([0][1])
[1]([0][1])
[2]([0][1])
where every row gets two elements
 */
public class MatrixTest {
    public static void main(String[] args) {
        int ages[][] = new int [3][2];
        ages[0][0] = 3;
        ages[0][1] = 5;
        ages[1][0] = 7;
        ages[1][1] = 9;
        ages[2][0] = 11;
        ages[2][1] = 13;
//We use a double index to access the values of the matrix
        System.out.println("ages[1][1] = " + ages[1][1]);
//Using a Nested FOR cycle, we can iterate over all values
        for (int row = 0; row < ages.length; row++){
            for (int col = 0; col < ages[row].length; col++){
                System.out.println("ages " + row + "-" + col +": " + ages[row][col]);
            }
        }
        //Another way to assign values:
        String fruits[][] = {{"Orange","Lemon"},{"Strawberry","Blueberry","Blackberry"}};
        for (int row = 0; row < fruits.length; row++){
            for (int col = 0; col < fruits[row].length; col++){
                System.out.println("fruits " + row + "-" + col + ": " + fruits[row][col]);
            }
        }
    }
}
