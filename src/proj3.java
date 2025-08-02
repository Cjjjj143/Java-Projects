import java.util.*;

public class proj3 {

    private static final Scanner sc = new Scanner(System.in);

    private static double calculate_bmi(double weight, double height) {
        return weight / (Math.pow(height, 2));
    }

    private static String get_user_input(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    private static double double_converter(String user_input) {
        return Double.parseDouble(user_input);
    }

    private static boolean number_checker(String user_input) {
        try {
            Double.parseDouble(user_input);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number or e to exit.");
            return false;
        }
    }

    private static boolean should_exit(String user_input){
        return user_input.trim().equalsIgnoreCase("e");
    }

    public static void exit() {
        System.out.println("Exiting...");
        System.exit(0);
    }

    public static void bmi_status_labeling(double bmi) {
        if (bmi < 18.5 ) {
            System.out.println("Status: Underweight");
        } else if (bmi <= 18.5 || bmi == 24.9 ) {
            System.out.println("Status: Normal");
        }else if (bmi <= 25.0 || bmi == 29.9) {
            System.out.println("Status: Overweight");
        } else if (bmi <= 30.0 || bmi == 34.9) {
            System.out.println("Status: Obese (Class 1)");
        } else if (bmi <= 35.0 || bmi == 39.9) {
            System.out.println("Status: Obese (Class 2)");
        } else {
            System.out.println("Status: Obese (Class 3)");
        }
    }


    public static void main (String[] args) {
        System.out.println("\nBMI Calculator");
        System.out.println("[Note: Enter e to exit.]\n");
        while (true) {
            String user_input1 = get_user_input("Weight (kg): ");
            if (should_exit(user_input1)) {
                exit();
            }
            if (number_checker(user_input1)) {
                double weight = double_converter(user_input1);
                while (true) {
                    String user_input2 = get_user_input("Height (m): ");
                    if (should_exit(user_input2)){
                        exit();
                    }
                    if (number_checker(user_input2)) {
                        double height = double_converter(user_input2);
                        double bmi = calculate_bmi(weight, height);
                        System.out.printf("BMI: %.2f\n", bmi);
                        bmi_status_labeling(bmi);
                        System.out.println(" ");
                        break;
                    }
                }
            }
        }
    }
}