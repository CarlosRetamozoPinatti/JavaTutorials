package enumeration;
//We can define attributes inside the enumerations:

public enum Continents {
    AMERICA(35),
    AFRICA(54),
    ASIA(48),
    EUROPE(50),
    OCEANIA(14);

    private final int countries;

    Continents(int countries){
        this.countries = countries;
    }

    //We can only use GET because the values are final
    public int getCountries(){
        return this.countries;
    }


}
