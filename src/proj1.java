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

        while (true) {
            System.out.print("Length Convertion Type No: ");
            String user_choice = sc.nextLine();
            System.out.println("\n");

            if (exit_checker(user_choice)) {
                exit();
                System.exit(0);
            }
            try {
                int final_user_choice = Integer.parseInt(user_choice);
                switch (final_user_choice) {
                    case 1:
                        System.out.println("[Length Convertion Type: Meter to Kilometer]\n");
                        System.out.print("Meter: ");
                        String meter_variable = sc.nextLine();
                        if (exit_checker(meter_variable)) {
                            exit();
                            System.exit(0);
                        }
                        double final_meter_variable = Double.parseDouble(meter_variable);
                        double result1 = length_weight1(final_meter_variable);
                        System.out.println("Kilometer: " + result1 + "km");
                        System.out.println("\n");
                        break;

                    case 2:
                        System.out.println("[Length Convertion Type: Kilometer to Meter]\n");
                        System.out.print("Kilometer: ");
                        String kilometer_variable = sc.nextLine();
                        if (exit_checker(kilometer_variable)) {
                            exit();
                            System.exit(0);
                        }
                        double final_kilometer_variable = Double.parseDouble(kilometer_variable);
                        double result2 = length_weight2(final_kilometer_variable);
                        System.out.println("Meter: " + result2 + "m");
                        System.out.println("\n");
                        break;
                    default:
                        System.out.println("Invalid convertion type no. Please enter a valid number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid convertion type no. Please enter a valid number or e to exit.");
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

            if (exit_checker(user_choice)) {
                exit();
                System.exit(0);
            }

            try {
                int final_user_choice = Integer.parseInt(user_choice);
                switch (final_user_choice) {
                    case 1:
                        System.out.println("[Weight Convertion Type: Grams to Kilograms]\n");
                        System.out.print("Grams: ");
                        String grams_variable = sc.nextLine();
                        if (exit_checker(grams_variable)) {
                            exit();
                            System.exit(0);
                        }
                        double final_grams_variable = Double.parseDouble(grams_variable);
                        double result1 = length_weight1(final_grams_variable);
                        System.out.println("Kilograms: "+result1+"kg");
                        System.out.println("\n");
                        break;
                    case 2:
                        System.out.println("[Weight Convertion Type: Kilograms to Grams]\n");
                        System.out.print("Kilograms: ");
                        String kilograms_variable = sc.nextLine();
                        if (exit_checker(kilograms_variable)) {
                            exit();
                            System.exit(0);
                        }
                        double final_kilograms_variable = sc.nextDouble();
                        double result2 = length_weight2(final_kilograms_variable);
                        System.out.println("Grams: "+result2+"g");
                        System.out.println("\n");
                        break;
                    default:
                        System.out.println("Invalid convertion type no. Please enter a valid number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid convertion type no. Please enter a valid number or e to exit.");
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
        while (true) {
            System.out.print("Temperature Convertion Type No: ");
            String user_choice = sc.nextLine();
            if (exit_checker(user_choice)) {
                exit();
                System.exit(0);
            }
            try {
                int final_user_choice = Integer.parseInt(user_choice);
                switch (final_user_choice) {
                    case 1:
                        System.out.println("[Temperature Convertion Type: Fahrenheit to Celsius]\n");
                        System.out.print("Fahrenheit: ");
                        String fahrenheit = sc.nextLine();
                        if (exit_checker(user_choice)) {
                            exit();
                            System.exit(0);
                        }
                        double final_fahrenheit = Double.parseDouble(fahrenheit);
                        double result1 = fahrenheit_to_celsius(final_fahrenheit);
                        System.out.println("Celsius: "+result1+"°C");
                        System.out.println("\n");
                        break;
                    case 2:
                        System.out.println("[Temperature Convertion Type: Celsius to Fahrenheit]\n");
                        System.out.print("Celsius: ");
                        String celsius = sc.nextLine();
                        if (exit_checker(celsius)) {
                            exit();
                            System.exit(0);
                        }
                        double final_celsius = Double.parseDouble(celsius);
                        double result2 = celsius_to_fahrenheit(final_celsius);
                        System.out.println("Fahrenheit: "+result2+"°F");
                        System.out.println("\n");
                        break;
                    default:
                        System.out.println("Invalid convertion type no. Please enter a valid number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid convertion type no. Please enter a number or e to exit.");
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
        System.out.print("Enter a number: ");
        int user_input = sc.nextInt();
        sc.nextLine();
        while (true) {
            try{
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
            }catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or e to exit.");
            }
        }
    }
}
