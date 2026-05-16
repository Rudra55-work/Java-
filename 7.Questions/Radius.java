import java.util.Scanner;

public class Radius {
    public static double readAndCircumference() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double c = 2 * Math.PI * r;
        // Do not close Scanner tied to System.in if more input is needed later
        return c;
    }

    public static void main(String[] args) {
        double circumference = readAndCircumference();
        System.out.println("Circumference = " + circumference);
        sc.close();
    }
}
