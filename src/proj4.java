import java.util.Scanner;

public class proj4 {
    private static final Scanner sc = new Scanner(System.in);

    private static boolean is_valid(String userInput ){
        if (userInput.equals("e")) {
            exit();
        }
        try {
            Integer.parseInt(userInput);
            return true;
        } catch (NumberFormatException e) {
            try {
                Double.parseDouble(userInput);
                return true;
            } catch (NumberFormatException b) {
                System.out.println("Invalid input. Please enter a number or e to exit.");
                return false;
            }
        }
    }
    private static void exit(){
        System.out.println("Exiting...");
        System.exit(0);
    }

    private static String get_userInput (String prompt){
        System.out.print(prompt);
        return sc.nextLine();
    }

    private static boolean is_double (String multiplicand, String multiplier_range){
        return multiplicand.contains(".") || multiplier_range.contains(".");
    }

    private static void int_table_creation(int multiplier, int multiplicand) {
        System.out.println("\nMultiplication Table");
        System.out.println();
        for (int i = 1; i <= multiplier; i++) {

            int product = multiplicand * i;

            String[][] row = {{String.valueOf(multiplicand), String.valueOf(i), String.valueOf(product)}};

            String table = String.format(" %s x %s = %s\n", row[0][0], row[0][1], row[0][2]);

            System.out.println(table);
        }
        System.out.println();
    }

    private static void double_table_creation(double multiplicand, double multiplier) {
        System.out.println("\nMultiplication Table");
        System.out.println();
        for (int i = 1; i <= multiplier; i++) {

            double product = multiplicand * i;

            String[][] row = {{String.valueOf(multiplicand), String.valueOf(i), String.valueOf(product)}};

            System.out.format(" %s x %s = %s\n", row[0][0], row[0][1], row[0][2]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("\nMultiplication Table Generator");
        System.out.println("\n[Note: Every number x 0 = 0. Enter e to exit.]");

        while (true) {
            String userInput1 = get_userInput("\nMultiplicand: ");
            if (is_valid(userInput1)) {
                while (true) {
                    String userInput2 = get_userInput("Multiplier: ");
                    if (is_valid(userInput2)) {
                        if (is_double(userInput1, userInput2)) {
                            double_table_creation(Double.parseDouble(userInput1), Double.parseDouble(userInput2));
                        }
                        int_table_creation(Integer.parseInt(userInput2), Integer.parseInt(userInput1));
                    }
                }
            }
        }
    }
}
