import java.util.Scanner;

public class Greeting_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = input.next();
        System.out.println("Hello !! "+name);
        System.out.println("Good Morning " +name);
    }
}
