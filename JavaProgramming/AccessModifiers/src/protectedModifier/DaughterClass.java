package protectedModifier;
//From this class, we can access the attributes of the Father Class.
public class DaughterClass extends Class02{
    public DaughterClass(){
        super();
        this.protAttribute = "Protected attribute modified";
        System.out.println("protAttribute = " + this.protAttribute);
        this.protMethod();
    }
}
