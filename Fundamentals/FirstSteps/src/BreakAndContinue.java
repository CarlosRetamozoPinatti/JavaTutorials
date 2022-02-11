public class BreakAndContinue {
    public static void main(String[] args) {
        //BREAK Sentence finish a cycle once the condition has been met.
        System.out.println("HERE WE USE BREAK");
        for (var counter = 0; counter < 10; counter++){
            if(counter % 2 == 0){
                System.out.println("counter = " + counter);
                break;
            }
        }
        //CONTINUE Sentence skips the actions when the condition has been met.
        System.out.println("HERE WE USE CONTINUE");
        for (var counter = 0; counter < 10; counter++){
        if(counter % 2 != 0){
            continue;
        }
            System.out.println("counter = " + counter);
        }
    }
}


