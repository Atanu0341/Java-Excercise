import java.util.Scanner;

public class AreaOfTriangle_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of the triangle : ");
        double base = in.nextDouble();
        System.out.println("Enter the height of the triangle : ");
        double height = in.nextDouble();

        double area = (height*base)/2;

        System.out.println("Area of the triangle : " +area);
    }
}
