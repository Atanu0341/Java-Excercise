import java.util.Scanner;

public class AreaOfIsoscelesTriangle_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the base of the isosceles triangle: ");
        double base = in.nextDouble();

        System.out.print("Enter the height of the isosceles triangle: ");
        double height = in.nextDouble();


        double area = 0.5 * base * height;

        System.out.println("Area of the isosceles triangle: " + area);
    }
}
