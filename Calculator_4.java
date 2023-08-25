import java.util.Scanner;

public class Calculator_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        double num1 = input.nextDouble();
        System.out.println("Enter second number : ");
        double num2 = input.nextDouble();

        System.out.println("Enter the operator (+, -, *, /) : ");
        char op = input.next().charAt(0);

        if (op == '+') {
            System.out.println("The sum of " + num1 + " and " + num2 + " = " + (num1 + num2));
        } else if (op == '-') {
            System.out.println("The subtraction of " + num1 + " and " + num2 + " = " + (num1 - num2));
        }
        else if (op == '*') {
            System.out.println("The multiplication of " + num1 + " and " + num2 + " = " + (num1 * num2));
        }
        else if (op == '/') {
            System.out.println("The division of " + num1 + " and " + num2 + " = " + (num1 / num2));
        }
        else {
            System.out.println("Invalid Input");
        }

    }
}
