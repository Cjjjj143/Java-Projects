import java.util.InputMismatchException;
import java.util.Scanner;

public class proj2 {
    private static final Scanner sc = new Scanner(System.in);

    private static String get_user_input() {
        return sc.nextLine();
    }

    private static int int_checker(String user_input){
        try {
            if (user_input.equals("e")) {
                exit();
            }
        } catch (InputMismatchException e)  {
            return Integer.parseInt(user_input);
        }
        return 0;
    }

    private static void start() {
        String options_list = """
                
                    [Note: Enter e to exit.]
                
                    =========================
                    ||   SELECT A RANGE    ||
                    =========================
                    ||    [1] 1 to 10      ||
                    ||    [2] 1 to 15      ||
                    ||    [3] Custom       ||
                    =========================
                """;
        System.out.print(options_list);
        System.out.print("Option No: ");
        String user_input = get_user_input();
        int chosen_option = int_checker(user_input);

    }


    private static void exit() {
    }

    public static void main(String[] args){
        System.out.println("\n[Number Guessing Game]\n");
        String greetings = """
        =========================================================================================
        ||                          Welcome to the Number Guessing Game!                       ||
        ||  Think you can guess the right number? Let's put your luck and logic to the test!   ||
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
        System.out.print("\nEnter a number: ");
        int user_input = sc.nextInt();

        switch (user_input){
            case 1:
                start();
                break;
            case 2:
                exit();
                break;
        }
    }
}