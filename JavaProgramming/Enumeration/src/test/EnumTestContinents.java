package test;

import enumeration.Continents;
//To access the attribute values in the enumeration, we do the next syntax.
public class EnumTestContinents {
    public static void main(String[] args) {
        System.out.println("Continent No 4: " + Continents.EUROPE);
        System.out.println("Countries in Continent No 4: " + Continents.EUROPE.getCountries());
    }
}
