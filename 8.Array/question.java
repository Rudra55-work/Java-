import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array input
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Take the number to search
        System.out.print("Enter the number to search: ");
        int x = sc.nextInt();

        // Search for x in the array
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println(x + " found at index " + i);
                found = true;
                break; // remove this line if you want all occurrences
            }
        }

        if (!found) {
            System.out.println(x + " not found in the array.");
        }

        sc.close();
    }
}


        

    

