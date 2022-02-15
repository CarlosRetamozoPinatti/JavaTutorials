package defaultModifier;

//Since it's inside the same package, it's not necessary import any other thing.
//It's not necessary to use a daughter class. I just implemented to test the dependencies.
public class TestDefaultMod {
    public static void main(String[] args) {
        DaughterClass daughterClass = new DaughterClass();
        System.out.println("daughterClass = " + daughterClass);
        daughterClass.defaultAttribute = "Changing Default Attribute";
        System.out.println("new default attribute = " + daughterClass.defaultAttribute);
    }
}
