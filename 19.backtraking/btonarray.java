public class btonarray {

    public static void changeArr(int arr[], int i, int val) {

        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        // recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);//fnx call step

        // backtracking
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int arr[]) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];

        changeArr(arr, 0, 1);
        printArr(arr);
    }
}

    


