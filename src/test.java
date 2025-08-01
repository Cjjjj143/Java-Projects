import java.util.*;

public class test{

    private static int number_generator(int range){
        Random rand = new Random();
        return rand.nextInt(range)+1;
    }

    private static boolean is_correct_guess(int guess, int num_to_guess){
        return guess == num_to_guess;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = 1;
        int tries = 5;
        while (true) {
            int num_to_guess1 = number_generator(2);
            System.out.printf("Round %d\n", round);
            System.out.print("Enter your guess: ");
            int final_guess1 = sc.nextInt();
            sc.nextLine();

            while (is_correct_guess(final_guess1, num_to_guess1)) {
                round++;
                System.out.println("Congratulations you got it right!");
                break;
            }

            while (!is_correct_guess(final_guess1, num_to_guess1)) {
                tries--;
                System.out.println("You got it wrong");
                System.out.println("Number to guess: "+num_to_guess1);
                System.out.printf("Available tries: %d\n", tries);
                break;
            }
            if (tries == 0) {
                System.out.println("You are out of tries.");
                break;
            }
        }
    }
}

