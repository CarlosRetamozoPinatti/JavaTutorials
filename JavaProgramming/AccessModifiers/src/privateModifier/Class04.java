package privateModifier;
//Private modifier cannot be used on classes.
//Private modifier negates the value modifications of attributes by other classes. No matter if it's inside the same package or is a daughter class.
//To modify these values we use the Get and Set methods. Seen in encapsulation.

public class Class04 {
    private String privateAttr = "Private Attribute Value";
//Private constructors only works inside this class.
    private Class04(){
        System.out.println("Initializing Private Constructor");
    }
//To use this outside the class, we need a Public Constructor.
    public Class04(String arg){
        this(); //this line allow us to execute the private constructor outside the class.
        System.out.println("Initializing Public Constructor");

    }

    private void privateMethod(){
        System.out.println("Initializing Private Method");
    }
//The Get and Set methods are needed to modify the values with this modifier.
    public String getPrivateAttr() {
        return privateAttr;
    }

    public void setPrivateAttr(String privateAttr) {
        this.privateAttr = privateAttr;
    }
}
