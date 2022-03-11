package domain;

import java.io.Serializable;

/*
A JavaBean is a Java class that should follow the following conventions:
It should have a no-arg constructor.
It should be Serializable (Serialization in Java is a mechanism of writing the state of an object into a byte-stream).
It should provide methods to set and get the values of the properties, known as getter and setter methods.
 */
public class Person implements Serializable {
    private String name;
    private String lastname;

    public Person(){
    }

    //This Constructor is not required. It's just here for mere practice.
    public Person(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    //ToString is not required. It's just here for mere practice.
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
