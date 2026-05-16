import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        int a = sc.nextInt(); // Read first integer
        int b = sc.nextInt(); // Read second integer
        int sum = a + b; // Calculate sum
        System.out.println(sum); // Print result

        sc.close(); // Close the scanner
    }
}

