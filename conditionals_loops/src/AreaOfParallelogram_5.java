import java.util.Scanner;

public class AreaOfParallelogram_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the base of the parallelogram: ");
        double base = in.nextDouble();

        System.out.print("Enter the height of the parallelogram: ");
        double height = in.nextDouble();


        double area = base * height;

        System.out.println("Area of the parallelogram: " + area);
    }
}
