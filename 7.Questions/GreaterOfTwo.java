//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class GreaterOfTwo {
    // Function that returns the greater of two numbers
    public static int greater(int a, int b) {
        // Either use ternary, or simply Math.max(a, b)
        return (a >= b) ? a : b;
        // return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        int g = greater(x, y);
        System.out.println("Greater number: " + g);

        sc.close();
    }
}
