



public class proj2 {
    public static void main(String[] args){
        System.out.println("\n[Number Guessing Game]\n");
        String greetings = """
        =========================================================================================
        ||                          Welcome to the Number Guessing Game!                       ||
        || Think you can guess the right number? Let's put your luck and logic to the test!    ||
        ||                                                                                     ||
        ||                              Choose your challenge:                                 ||
        ||                                                                                     ||
        ||                      - Range 1 to 10 – Quick and tricky!                            ||
        ||                      - Range 1 to 15 – A bit more challenging!                      ||
        ||                      - Or set your own custom range                                 ||
        ||                        You decide how easy or hard it gets!                         ||
        ||                                                                                     ||
        ||              You only have 5 tries, so make every guess count!                      ||
        ||                                                                                     ||
        ||                Are you ready to play? Let the guessing begin!                       ||
        =========================================================================================
    """;

        System.out.println(greetings);
        System.out.println("[1] Start\n[2] Exit");


    }
}