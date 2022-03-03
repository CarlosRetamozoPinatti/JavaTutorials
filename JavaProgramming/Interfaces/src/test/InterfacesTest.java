package test;
/*
Interfaces work the same way as Abstract Classes.
They are better at the use of abstract behaviors than attributes.
It's like a Parent class.
 */
import dataaccess.DataAccess;
import dataaccess.MySQLBoot;
import dataaccess.OracleBoot;

public class InterfacesTest {
    public static void main(String[] args) {
        //We cannot instantiate an Interface, so we make an instance of the object that uses it.
        //The implemented methods will be the ones of the instantiated object, not the interface itself.
        DataAccess data = new MySQLBoot();
        data.makeList();

        data = new OracleBoot();
        print(data);

    }
    //We can create public methods out of the Interface methods.
    public static void print(DataAccess data){
        data.makeList();
    }
}
