package Operations;

public class Arithmetic {
    //Class attributes. The int type default value is 0.
    int a;
    int b;
    //-------------------
    //Empty Constructor. Constructors are needed to create objects with attributes and methods of the class.
    public Arithmetic(){
        System.out.println("Executing Constructor..");
    }
    //Constructor with parameters.
    public Arithmetic(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Executing constructor with args..");
    }
    //-------------------
    //Class Methods
    //The Void statement makes the method not return any value, we've got to print it.
    public void addition() {
    int result = a + b;
        System.out.println("result = " + result);
    }
    //The int statement makes the method returns an int value
    public int addWithReturn(){
        return a + b;
    }
    //Now, we define a method that will use arguments.
    //THIS operator is optional, it makes reference to a class attribute, not a local variable.
    //THIS operator needs to be explicit if we name the arguments the same as the attributes.
    public int addWithArgs(int a, int b){
        this.a = a;
        this.b = b;
        return this.addWithReturn();
    }
}
