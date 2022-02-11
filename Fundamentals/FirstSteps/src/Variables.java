//Different kind of variables:
public class Variables {
    public static void main(String args[]){
        //int or Integer for numbers. int is a primitive kind of variable.
        int integerVariable = 10;
        System.out.println(integerVariable);
        integerVariable = 15;
        System.out.println(integerVariable);

        //String for words,phrases or letters. String is not a primitive but a class in Java.
        String stringVariable = "Hello There!";
        System.out.println(stringVariable);
        stringVariable = "Ah, General Kenobi..";
        System.out.println(stringVariable);

        //Variable inference. Java 10 and above can predict the kind of variable in use by inference.
        var integerVariable2 = 30;
        System.out.println(integerVariable2);
        var stringVariable2 = "No Luke, I'm your Father";
        System.out.println(stringVariable2);

        //Concatenation of variables.
        var name = "John";
        var surname = "Doe";
        var degree = "Engineer";
        var i = 3;
        var j = 4;
        var concatenated = degree + " " + surname + "," + name;
        System.out.println(concatenated);
        var concatenated2 = degree + " " + surname + "," + name + " --- " + "Degree's Average:" + (i + j);
        System.out.println(concatenated2);

        //String Context. If the first variable is a string, everything else will be treated as a string.
        var concatenated3 = surname + "," + name + " --- " + "Degree's Average:" + i + j;
        System.out.println(concatenated3);

        //Special characters.
        System.out.println("New Line: \n" + name);
        System.out.println("Tabulator: \t" + name);
        System.out.println("Backspace: \b" + name);
        System.out.println("Simple quotation mark: \'" + name + "'");
        System.out.println("Double quotation mark: \"" + name + "\"");

    }
}
