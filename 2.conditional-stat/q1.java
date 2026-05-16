import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.println("Enter your first no. :-");
        int a = sc.nextInt(); 

        System.out.println("Enter your second no. :-");
        int b = sc.nextInt(); 
    if (a==b) {
            System.out.println("equal");
        }
        else if (a>b) {
            System.out.println("a is greater");
        }

    else{
            System.out.println("a is lesser");
        }

        sc.close(); // Close the scanner
    }
}
