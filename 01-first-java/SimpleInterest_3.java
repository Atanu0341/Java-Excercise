import java.util.Scanner;

public class SimpleInterest_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal Amount : ");
        int principal = input.nextInt();
        System.out.println("Enter Rate of Interest : ");
        int rate = input.nextInt();
        System.out.println("Enter Time : ");
        int time = input.nextInt();

        int simple_interest = (principal*rate*time)/100;
        System.out.println("Simple Interest : "+simple_interest);
    }
}
