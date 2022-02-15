package defaultModifier;
//the Default or Package modifier allows the use of files inside the same package only.
//It is more restrictive than the public and protected modifiers
class Class03 {
    String defaultAttribute = "Initializing Default Attribute";

    Class03(){
        System.out.println("Initializing Default Constructor");

    }

    void defaultMethod(){
        System.out.println("Initializing Default Method");
    }
}
