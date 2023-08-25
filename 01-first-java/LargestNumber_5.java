import java.util.Scanner;

public class LargestNumber_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a = input.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = input.nextInt();

        if (a>b){
            System.out.println(a+" is the largest number");
        }
        else {
            System.out.println(b+" is the largest number");
        }

    }
}
