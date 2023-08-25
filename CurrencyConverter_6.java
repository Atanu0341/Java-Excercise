import java.util.Scanner;

public class CurrencyConverter_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Amount : ");
        double amt = input.nextDouble();
        System.out.println("Currency Converter");
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        System.out.print("Enter your choice (1/2): ");
        int choice = input.nextInt();

        if (choice == 1){
            // INR to USD conversion rate
            System.out.println("Converted amount in USD: " + (amt*83.11));
        }
        else if (choice == 2) {
            // USD to INR conversion rate
            System.out.println("Converted amount in INR: " + (amt*0.012));
        }
        else {
            System.out.println("Invalid choice!");
        }

    }
}
