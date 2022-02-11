//Executes at least one time the code, despite a false condition

public class DoWhile {
    public static void main(String[] args) {
        var counter = 0;
        do {
            System.out.println("counter = " + counter);
            counter++;
        } while (counter<0);
        }

    }

