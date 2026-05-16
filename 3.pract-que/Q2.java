// Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number To Month Conversion");

        System.out.print("Enter choice (1/2/3/4/5/6/7/8/9/10/11/12): ");
        int choice = scanner.nextInt();


        switch (choice) {
            case 1:
              
                System.out.println("Janauary");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
           case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}