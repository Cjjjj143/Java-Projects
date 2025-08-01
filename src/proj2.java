import java.util.Random;
import java.util.Scanner;

public class proj2 {

    private static final Scanner sc = new Scanner(System.in);

    private static void exit() {
        System.out.println("Exiting...");
        System.exit(0);
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
        Random rand = new Random();
        return rand.nextInt(range)+1;
    }

    private static boolean is_correct_guess(int guess, int num_to_guess){
        return guess == num_to_guess;
    }

    private static void checking_session(int round, int tries, int range, int score) {
        while (true) {
            int num_to_guess = number_generator(range);
            System.out.printf("\n[Round %d]\n", round);
            String formatted_prompt = String.format("Enter your guess [1 -> %d]: ",range);
            String user_input = get_user_input(formatted_prompt);
            int final_guess = int_checker(user_input);


            if (is_correct_guess(final_guess, num_to_guess)) {
                System.out.println("Congratulations you got it right!");
                System.out.printf("Score: %d", score);
                round++;
                score++;
            }
            else {
                tries--;
                System.out.println("Wrong Guess.");
                System.out.println("Correct Number: "+num_to_guess);
                System.out.printf("Tries left: %d", tries);
                System.out.printf("Score: %d\n", score);

                if (tries == 0) {
                    System.out.println("You are out of tries. Want to try again?");

                    while (true) {
                        String user_input2 = get_user_input("y/n: ");

                        if (user_input2.equals("y")) {
                            round = 1;
                            tries = 5;
                            score = 0;
                            break;
                        } else if (user_input2.equals("n")) {
                            exit();
                            return;
                        }
                        else {
                            System.out.println("Invalid input. Please input y(yes), n(no), or e(exit).");
                        }
                    }
                }
            }
        }
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

        int round = 1;
        int tries = 5;
        int score = 0;

        switch (chosen_option) {
            case 1:
                checking_session(round, tries, 10, score);
                break;
            case 2:
                checking_session(round, tries, 15, score);
                break;
            case 3:
                String user_input4 = get_user_input("Enter your desired range (Eg. 100): ");
                int desired_range = int_checker(user_input4);
                checking_session(round, tries, desired_range, score);
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