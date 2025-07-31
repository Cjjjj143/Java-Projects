import java.util.*;

public class proj1 {
    private static final Scanner sc = new Scanner(System.in);

    public static void length(){
        String string_format = """
        ===============================
        ||  Length Convertion Types  ||
        ||===========================||
        ||  1. Meter to Kilometer    ||
        ||  2. Kilometer to Meter    ||
        ===============================
        """;
        System.out.println("\n"+string_format);
        System.out.println("[Note: Enter e to exit]\n");
        System.out.print("Length Convertion Type No: ");
        String user_choice = sc.nextLine();
        try {
            int final_user_choice = Integer.parseInt(user_choice);
            switch (final_user_choice) {
                case 1:
                    System.out.print("Meter: ");
                    String meter_variable = sc.nextLine();
                    if (exit_checker(meter_variable)) {
                        exit();
                        System.exit(0);
                    }
                    double final_meter_variable = Double.parseDouble(meter_variable);
                    double result1 = length_weight1(final_meter_variable);
                    System.out.println("Kilometer: " + result1 + "km");
                    break;

                case 2:
                    System.out.print("Kilometer: ");
                    String kilometer_variable = sc.nextLine();
                    if (exit_checker(kilometer_variable)) {
                        exit();
                        System.exit(0);
                    }
                    double final_kilometer_variable = Double.parseDouble(kilometer_variable);
                    double result2 = length_weight2(final_kilometer_variable);
                    System.out.println("Meter: " + result2 + "m");
                    break;
                default:
                    System.out.println("Invalid convertion type no. Please enter a valid number.");
            }
        } catch (NumberFormatException e) {
            if (exit_checker(user_choice)) {
                exit();
                System.exit(0);
            }
        }
    }

    private static double length_weight1(double v1){
      return v1 / 1000;
    }

    private static double length_weight2(double v2){
        return v2 * 1000;
    }

    private static boolean exit_checker(String user_input) {
        return user_input.equals("e");
    }

    public static void weight(){
        String string_format = """
        ===============================
        ||  Weight Convertion Types  ||
        ||===========================||
        ||  1. Grams to Kilograms    ||
        ||  2. Kilograms to Grams    ||
        ===============================
        """;
        System.out.println("\n"+string_format);
        System.out.println("[Note: Enter e to exit]\n");

        while (true) {
            System.out.print("Weight Convertion Type No: ");
            String user_choice = sc.nextLine();
            try {
                if (exit_checker(user_choice)) {
                    exit();
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
                int final_user_choice = Integer.parseInt(user_choice);
                switch (final_user_choice) {
                    case 1:
                        System.out.print("Grams: ");
                        String grams_variable = sc.nextLine();
                        if (exit_checker(grams_variable)) {
                            exit();
                            System.exit(0);
                        }
                        double final_grams_variable = Double.parseDouble(grams_variable);
                        double result1 = length_weight1(final_grams_variable);
                        System.out.println("Kilograms: "+result1+"kg");
                        break;
                    case 2:
                        System.out.print("Kilograms: ");
                        String kilograms_variable = sc.nextLine();
                        if (exit_checker(kilograms_variable)) {
                            exit();
                            System.exit(0);
                        }
                        double final_kilograms_variable = sc.nextDouble();
                        double result2 = length_weight2(final_kilograms_variable);
                        System.out.println("Grams: "+result2+"g");
                        break;
                    default:
                        System.out.println("Invalid convertion type no. Please enter a valid number.");
                }
            }
        }
    }
    public static void temperature(){
        String string_format = """
        ====================================
        ||  Temperature Convertion Types  ||
        ||================================||
        || 1. Fahrenheit to Celsius       ||
        || 2. Celsius to Fahrenheit       ||
        ====================================
        """;
        System.out.println("\n"+string_format);
        System.out.println("[Note: Enter e to exit]\n");
        System.out.print("Temperature Convertion Type No: ");
        while (true) {
            String user_choice = sc.nextLine();
            try {
                if (exit_checker(user_choice)) {
                    exit();
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
                int final_user_choice = Integer.parseInt(user_choice);
                switch (final_user_choice) {
                    case 1:
                        System.out.print("Fahrenheit: ");

                        String fahrenheit = sc.nextLine();
                        if (exit_checker(user_choice)) {
                            exit();
                            System.exit(0);
                        }
                        double final_fahrenheit = Double.parseDouble(fahrenheit);
                        double result1 = fahrenheit_to_celsius(final_fahrenheit);
                        System.out.println("Celsius: "+result1+"°C");
                        break;
                    case 2:
                        System.out.print("Celsius: ");
                        String celsius = sc.nextLine();
                        if (exit_checker(celsius)) {
                            exit();
                            System.exit(0);
                        }
                        double final_celsius = Double.parseDouble(celsius);
                        double result2 = celsius_to_fahrenheit(final_celsius);
                        System.out.println("Fahrenheit: "+result2+"°F");
                        break;
                    default:
                        System.out.println("Invalid convertion type no. Please enter a valid number.");
                }
            }
        }
    }

    private static double fahrenheit_to_celsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    private static double celsius_to_fahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void exit(){
        System.out.println("Exiting...");
    }
    public static void main(String[] args) {
        System.out.println("\nUnit Converter");
        String options_format = """
             =======================
             ||      Options      ||
             ||===================||
             ||  1. Length        ||
             ||  2. Weight        ||
             ||  3. Temperature   ||
             ||  4. Exit          ||
             =======================\s
         """;
        System.out.println(options_format);
        while (true) {
            System.out.print("Enter a number: ");
            int user_input = sc.nextInt();
            sc.nextLine();
            switch (user_input){
                case 1:
                    length();
                    break;
                case 2:
                    weight();
                    break;
                case 3:
                    temperature();
                    break;
                case 4:
                    exit();
                    return;
                default:
                    System.out.println("Invalid input. Please enter a number that ranges from 1-4.");
            }
        }
    }
}
