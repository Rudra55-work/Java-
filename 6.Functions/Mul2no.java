import java.util.Scanner;
public class Mul2no {
    public static int calculateMul(int a,int b) {
        int mul = a * b;
        return mul;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        
        int sum = calculateMul(a, b);
        System.out.println("The mul of two numbers is: " + sum);
        sc.close();
    }
}