import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter third number: ");
        double c = sc.nextDouble();

        double avg = average(a, b, c);
        System.out.println("Average: " + avg);

        sc.close();
    }

    // Function to compute average of three numbers
    static double average(double x, double y, double z) {
        return (x + y + z) / 3.0;
    }
}
