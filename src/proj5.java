import java.util.Scanner;

public class proj5 {

    private static final Scanner sc = new Scanner(System.in);

    private static String getUserInput(){
        System.out.print("Enter a word/number: ");
        return sc.nextLine();
    }

    private static boolean is_palindrome(String user_input){
        return user_input.contentEquals(new StringBuilder(user_input).reverse());
    }

    private static boolean has_valid_numberLength(String user_input) {
        return  user_input.length() >= 2;
    }

    private static boolean has_valid_wordLength(String user_input) {
        return  user_input.length() > 2;
    }

    private static boolean is_number(String user_input){
        try {
            Double.parseDouble(user_input);
            return true;
        } catch (NumberFormatException e){
            try {
                Integer.parseInt(user_input);
                return true;
            } catch (NumberFormatException b) {
                return false;
            }
        }
    }

    private static void exit(){
        System.out.println("Exiting...");
        System.exit(0);
    }


    public static void main(String[] args) {
        System.out.println("\nPalindrome Checker\n");
        System.out.println("[Note: Enter e to exit.]");
        while (true) {
            String user_input = getUserInput();
            if (user_input.equals("e")) {
                exit();
            }
            if (is_number(user_input)) {
                if (has_valid_numberLength(user_input)) {
                    if (is_palindrome(user_input)) {
                        System.out.format("%s is a palindrome\n\n", user_input);
                    }
                    else {
                        System.out.format("%s is not a palindrome\n\n", user_input);
                    }
                }
                else {
                    System.out.println("Invalid input. Please enter a number with a minimum of 2 digits.");
                }
            }
            else {
                if (has_valid_wordLength(user_input)) {
                    if (is_palindrome(user_input)) {
                        System.out.format("The word '%s' is a palindrome.\n\n", user_input);
                    }
                    else {
                        System.out.format("The word '%s' is not a palindrome.\n\n", user_input);
                    }
                }
                else {
                    System.out.println("Invalid input. Please enter a word with a minimum of 3 letters");
                }
            }
        }
    }
}
