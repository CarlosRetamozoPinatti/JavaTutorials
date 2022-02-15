package publicModifier;
//The Public modifier allows the global use of classes, variables, methods and constructors.

public class Class01 {
    //Here we create a public attribute
    public String publicAttribute = "Public Attr. Value";
    //Here we create a public constructor
    public Class01(){
        System.out.println("Public Constructor Created");
    }
    //Here we create a public method
    public void publicMethod(){
        System.out.println("Public Method Executed");
    }
}
