import java.util.Random;
import java.util.Scanner;

public class proj2 {

    private static final Scanner sc = new Scanner(System.in);

    private static void exit() {
        System.out.println("Exiting...");
    }

    private static int int_checker(String user_input) {
        if (user_input.equals("e")) {
            exit();
        }
        try {
            return Integer.parseInt(user_input);

        } catch (NumberFormatException e)  {
            return 0;
        }
    }

    private static String get_user_input(String prompt){
        System.out.print(prompt);
        return sc.nextLine();
    }

    private static int number_generator(int range){
        do {
            Random rand = new Random();
            return rand.nextInt(range);
        } while (true);
    }

    private static boolean is_correct_guess(int guess, int num_to_guess){
        return guess == num_to_guess;
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
        System.out.print(options_list+"\n");
        String user_input1 = get_user_input("Option No: ");
        int chosen_option = int_checker(user_input1);

        int tries = 5;

        switch (chosen_option) {
            case 1:
                int num_to_guess1 = number_generator(10);
                for (int i = 1; i <= 5; i++) {
                    String guess1 = get_user_input("Enter your guess [1 -> 10]: ");
                    int final_guess1 = int_checker(guess1);

                    if (is_correct_guess(final_guess1, num_to_guess1)) {


                    }
                }
                break;
            case 2:
                int num_to_guess2 = number_generator(15);
                String guess2 = get_user_input("Enter your guess [1 -> 15]: ");
                break;
            case 3:
                String user_input2 = get_user_input("Enter your desired range (Eg. 100): ");
                int desired_range = int_checker(user_input2);
                int num_to_guess3 = number_generator(desired_range);
                String formatted_prompt = String.format("Enter your guess [1 -> %d]: ",desired_range);
                String guess3 = get_user_input(formatted_prompt);
                break;
        }
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
        ||                  You only have 5 tries, so make every guess count!                  ||
        ||                                                                                     ||
        ||                   Are you ready to play? Let the guessing begin!                    ||
        =========================================================================================
    """;

        System.out.println(greetings);
        System.out.println("[1] Start\n[2] Exit");
        System.out.print("\nEnter a number: ");
        int user_input = sc.nextInt();
        sc.nextLine();

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