package defaultModifier;

public class DaughterClass extends Class03{
   public DaughterClass(){
       super();
       this.defaultAttribute = "Default attribute modified";
       System.out.println("defaultAttribute = " + this.defaultAttribute);
       this.defaultMethod();
        }
    }


