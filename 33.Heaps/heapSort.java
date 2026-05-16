import java.util.*;

public class heapSort {

    // Heapify (Max Heap)
    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            // swap
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void heappSort(int arr[]) {

        int n = arr.length;

        // Step 1: Build Max Heap
        for (int i = n/2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements
        for (int i = n-1; i > 0; i--) {
            // swap root with last
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};

        heappSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
             System.out.println();
        }
       
    }
    
}
