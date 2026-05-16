public class diagonalsum {

    public static void printDiagonalSum(int matrix[][]){
        int sum = 0;   // declare sum

        // // brute force (O(n)^2)
        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[0].length; j++){

        //         // primary diagonal
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }
        //         // secondary diagonal
        //         else if(i + j == matrix.length - 1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        // System.out.println("Diagonal Sum = " + sum);


        //Optimized Version (O(n))

    for(int i = 0; i < matrix.length; i++){
        sum += matrix[i][i]; // primary

        if(i != matrix.length - 1 - i){
            sum += matrix[i][matrix.length - 1 - i]; // secondary
        }
    }

    System.out.println("Diagonal Sum = " + sum);
}
    
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        printDiagonalSum(matrix);
    }
}
