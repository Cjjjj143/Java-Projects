
import java.util.*;

public class Calc_UpgradedVer {

    private  final List<Float> numbers;
    private final char operation;

    public Calc_UpgradedVer(List<Float> numbers, char operation) {
        this.numbers = numbers;
        this.operation = operation;
    }
    private double addition(){
        double sum = 0;
        for (float number : numbers) {
            sum += number;
        }
        return sum;
    }
    private double subtraction(){

        double difference = numbers.getFirst();

        for (int i = 1; i < numbers.size(); i++) {
            difference -= numbers.get(i);
        }
        return difference;
    }
    private double multiplication() {
        double product = 1;
        for (float number: numbers) {
            product *= number;
        }
        return product;
    }
    private double division(){
        double quotient = numbers.getFirst();

        for (int i = 1; i < numbers.size(); i++) {
            quotient /= numbers.get(i);
        }
        return quotient;
    }
    private void calculate(){
        switch (operation) {
            case '+':
                double sum = addition();
                if (sum % 1 == 0) {
                    System.out.println("Sum: " + (int) sum);
                } else {
                    System.out.println("Sum: " + sum);
                }
                break;
            case '-':
                double difference = subtraction();
                if (difference % 1 == 0) {
                    System.out.println("Difference: " + (int) difference);
                } else {
                    System.out.println("Difference: " + difference);
                }
                break;
            case '*':
                double product = multiplication();
                if (product % 1 == 0) {
                    System.out.println("Product: " + (int) product);
                } else {
                    System.out.println("Product: " + product);
                }
                break;

            case '/':
                double quotient = division();
                if (quotient % 1 == 0) {
                    System.out.println("Quotient: " + (int) quotient);
                } else {
                    System.out.println("Quotient: " + quotient);
                }
                break;
        }
    }

    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator");

        while (true) {
            System.out.print("Enter a number: ");
            String num1 = sc.nextLine();

            System.out.print("Choose an operation (+, -, *, /): ");
            char operation = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Enter another number: ");
            String num2 = sc.nextLine();

            float final_num1 = Float.parseFloat(num1);
            float final_num2 = Float.parseFloat(num2);

            Calc_UpgradedVer calc = new Calc_UpgradedVer(List.of(final_num1, final_num2), operation);
            calc.calculate();
        }
    }
}