import java.util.Scanner;

public class evenOdd_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = input.nextInt();

        if (num%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}
