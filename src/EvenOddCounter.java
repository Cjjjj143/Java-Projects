import java.util.Scanner;

public class EvenOddCounter {
    private static final Scanner sc = new Scanner(System.in);
    int num;
    boolean is_Even(){
        return num % 2 == 0;
    }
    boolean is_Odd(){
        return !is_Even();
    }

    static class Program_Helper {
        String getUserInput(){
            System.out.print("Enter a number: ");
            return sc.nextLine();
        }
        boolean is_valid(String user_input) {
            if (user_input.trim().equalsIgnoreCase("e")) {
                exit();
            }
            try {
                Integer.parseInt(user_input);
                return true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number only.\n");
                return false;
            }
        }
        String get_result(EvenOddCounter counter){
            if (counter.is_Even()) {
                return String.format("%d is an even number.", counter.num);
            }
            return String.format("%d is an odd number.", counter.num);
        }
        void exit(){
            System.out.println("Exiting...");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        System.out.println("\nEven or Odd Counter\n");
        System.out.println("[Note: Only enter an integer(whole number). Enter e to exit.]\n");
        while (true) {
            EvenOddCounter counter = new EvenOddCounter();
            Program_Helper helper = new Program_Helper();
            String userInput = helper.getUserInput();
            if (helper.is_valid(userInput)) {
                counter.num = Integer.parseInt(userInput);
                String result = helper.get_result(counter);
                System.out.println("Result: "+result+"\n");
            }
        }
    }
}
