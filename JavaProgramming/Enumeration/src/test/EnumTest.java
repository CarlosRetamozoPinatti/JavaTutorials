package test;

import enumeration.Days;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Fist Day of the week: " + Days.MONDAY);
        indicateDay(Days.FRIDAY);
    }
    //We use the Switch to create responses for every option of the enumeration.
    //This Syntax of the Switch Structure doesn't explicit use the break sentence.
    private static void indicateDay(Days days){
        switch (days){
            case MONDAY -> System.out.println("First Day");
            case TUESDAY -> System.out.println("Second Day");
            case WEDNESDAY -> System.out.println("Third Day");
            case THURSDAY -> System.out.println("Fourth Day");
            case FRIDAY -> System.out.println("Fifth Day");
            case SATURDAY -> System.out.println("Sixth Day");
            case SUNDAY -> System.out.println("Seventh Day");
        }
    }
}
