package domain;

//an initializer block is a piece of code that executes before the class constructor.
//there are two kinds of initializer blocks. Static and Dynamic.
public class Person {
    private final int idPerson;
    private static int personCount;

    //In static blocks, we cannot use " this. " operator.
    //We can only initialize STATIC parameters here.
    //This block ONLY EXECUTES ONCE. When it's loaded to memory.
    static{
        System.out.println("Here we execute the Static Initializer Block");
        ++Person.personCount;
    }

    //The Non-Static block is created using only the brackets.
    //This block Executes EVERYTIME we create a class object.

    {
        System.out.println("Here we execute the Non Static Initializer Block");
        this.idPerson = Person.personCount++;
    }
    public Person(){
        System.out.println("Here we execute the Class Constructor");
    }

    public int getIdPerson() {
        return idPerson;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idPerson=" + idPerson +
                '}';
    }
}
