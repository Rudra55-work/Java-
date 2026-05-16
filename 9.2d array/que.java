import java.util.Scanner;
public class que {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Take number to search
        System.out.print("Enter the number to search: ");
        int x = sc.nextInt();

        boolean found = false;

        // Search for x in the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == x) {
                    System.out.println(x + " found at position (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println(x + " not found in the matrix.");
        }

        sc.close();
    }
}

    

        

    
