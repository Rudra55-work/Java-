import java.util.Scanner;
public class creation {
//for searching the value at key index
    public static boolean search( int matrix[] [], int key ){
        int n = matrix.length;
         int  m = matrix[0].length;
        for ( int i=0; i<n; i++){
            for( int j=0; j<m; j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell ("+ i + ","+ j + ")" );
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    //crreation of the 2d arrrays
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
         int n = matrix.length;
         int  m = matrix[0].length;

         Scanner sc = new Scanner(System.in);
         for( int i=0; i<n; i++){
            for( int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
         }

         //output
         for( int i=0; i<n; i++){
            for( int j=0; j<m; j++){
             System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
         }
         search(matrix, 5);
         sc.close();

    }
    
}