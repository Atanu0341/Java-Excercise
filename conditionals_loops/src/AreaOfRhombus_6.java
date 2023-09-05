import java.util.Scanner;

public class AreaOfRhombus_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of one of the diagonals of the rhombus : ");
        double d1 = in.nextDouble();
        System.out.println("Enter the length of the other diagonal of the rhombus : ");
        double d2 = in.nextDouble();

        double area = (d1 * d2) / 2;

        System.out.println("Area of the rhombus: " + area);
    }
}
