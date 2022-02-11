//Char type uses Unicode characters.

public class PrimitiveCharType {
    public static void main(String args []){
        //To assign characters with the Keyboard.
        char charVariable = '!';
        System.out.println("charVariable = " + charVariable);

        //To assign characters with the Code notation of Unicode.
        char charVariable2 = '\u0021';
        System.out.println("charVariable2 = " + charVariable2);

        //To assign characters with the Decimal notation of Unicode.
        char charVariable3 = 33;
        System.out.println("charVariable3 = " + charVariable3);

        //Using Inference.
        var charVariable4 = '!';
        System.out.println("charVariable4 = " + charVariable4);

        var charVariable5 = '\u0021';
        System.out.println("charVariable5 = " + charVariable5);

        //Java assumes it's a decimal. It's going to take the literal value.
        var charVariable6 = 33;
        System.out.println("charVariable6 = " + charVariable6);

        //Using the Int type to do it backwards. It prints the decimal value of the symbol.
        int charVariable7 = '!';
        System.out.println("charVariable7 = " + charVariable7);
    }
}
