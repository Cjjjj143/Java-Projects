import java.util.*;

public class test {

    private static final Scanner sc = new Scanner(System.in);


    private static String type_checker(String userInput){
        if (userInput.contains(".")) {
            return "double";
        }
        return "int";
    }
    private static int number_generator(int range) {
        Random rand = new Random();
        return rand.nextInt(range) + 1;
    }

    private static String get_user_input(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }


    private static void table_generator(double multiplicand, double multiplier_range){
        String header = """
                    +--------------------------+
                    |   Multiplication Table   |
                    +--------------------------+
                    """;
        System.out.println(header);
        for (double i = 1; i <= multiplier_range; i++) {
            double product = multiplicand * i;

            String[][] row = {
                    {String.valueOf(multiplicand), String.valueOf(i), String.valueOf(product)}
            };

            String table_format = String.format("%s x %s = %s", row[0][0], row[0][1], row[0][2]);
            System.out.println(table_format);
        }
        System.out.println("+--------------------------+");
    }

    private static int get_numLength(int num) {
        return String.valueOf(num).length();
    }

    public static void main(String[] args) {

        String multiplicand = get_user_input("Multiplicand: ");
        String multiplicand_type = type_checker(multiplicand);
        String multiplier_range = get_user_input("Multiplier Range: ");
        String multiplier_type = type_checker(multiplicand);
        table_generator(Integer.parseInt(multiplicand), Integer.parseInt(multiplier_range));

        String int_table = """
                    +--------------------------+
                    |   Multiplication Table   |
                    +--------------------------+
                    |        1 x 1 = 1         |
                    |        1 x 2 = 2         |
                    |        1 x 3 = 3         |
                    |        1 x 4 = 4         |
                    |        1 x 5 = 5         |
                    |        1 x 6 = 6         |
                    |        1 x 7 = 7         |
                    |        1 x 8 = 8         |
                    |        1 x 9 = 9         |
                    |        1 x 10 = 10       |
                    +--------------------------+
                """;

        String int_table2 = """
                    +--------------------------+
                    |   Multiplication Table   |
                    +--------------------------+
                    |        1 x 10 = 1        |
                    |        1 x 20 = 2        |
                    |        1 x 30 = 3        |
                    |        1 x 40 = 4        |
                    |        1 x 50 = 5        |
                    |        1 x 60 = 6        |
                    |        1 x 70 = 7        |
                    |        1 x 80 = 8        |
                    |        1 x 90 = 9        |
                    |        1 x 100 = 10      |
                    +--------------------------+
                """;

        String int_table3 = """
                    +--------------------------+
                    |   Multiplication Table   |
                    +--------------------------+
                    |       10 x 10 = 100      |
                    |       10 x 20 = 200      |
                    |       10 x 30 = 300      |
                    |       10 x 40 = 400      |
                    |       10 x 50 = 500      |
                    |       10 x 60 = 600      |
                    |       10 x 70 = 700      |
                    |       10 x 80 = 800      |
                    |       10 x 90 = 900      |
                    |       10 x 100 = 1000    |
                    +--------------------------+
                """;



//        int multiplicand_length = get_numLength(multiplicand);
//        int multiplier_length = get_numLength(multiplier_range);
//
//        int lspace_to_remove = ;
//
//        int rspace_added = lspace_to_remove;
    }
}
