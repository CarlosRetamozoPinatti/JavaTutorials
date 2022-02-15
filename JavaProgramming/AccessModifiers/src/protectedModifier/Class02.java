package protectedModifier;
//Protected Modifier allows access attributes, methods and constructors using the super().
//It's not the same way as Inheritance. Inheritance doesn't use the super().
//Classes cannot use this modifier.
//To access protected modifiers from outside the package, we need a Daughter that extends from the Protected Class.
//The Daughter class can be anywhere. Inside or Outside the package.
public class Class02 {
    //Here we create a protected attribute
    protected String protAttribute = "Protected Attr. Value";
    //Here we create a protected constructor

    protected Class02(){
        System.out.println("Protected constructor created");
    }

    //Here we create a protected method
    protected void protMethod(){
            System.out.println("Protected Method Executed");
        }
    }


