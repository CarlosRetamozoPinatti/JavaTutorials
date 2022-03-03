package dataaccess;
//Here we simulate an SQL connection to use the interfaces.
//It's not a real connection, it's just to understands how an Interface works.
//We use the IDE support to implement all the methods.
//Here is used the syntax of the mentioned SQL Engine.
public class OracleBoot implements DataAccess{
    @Override
    public void insert() {
        System.out.println("Insert from Oracle");

    }

    @Override
    public void refresh() {
        System.out.println("Refresh from Oracle");

    }

    @Override
    public void erase() {
        System.out.println("Delete from Oracle");

    }

    @Override
    public void makeList() {
        System.out.println("Make a list from Oracle");

    }
}
