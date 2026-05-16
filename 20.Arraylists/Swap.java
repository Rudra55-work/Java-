import java.util.ArrayList;
import java.util.Collections;
public class Swap {
    public static void swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3); 
        list.add(6);
        
        int index1 = 1; // index of the first element to swap
        int index2 = 3; // index of the second element to swap
        System.out.println("Before swapping: " + list);
        swap(list, index1, index2);
        System.out.println("After swapping: " + list);

/////////////////////////////////////////////////////
        Collections.sort(list); // Sorting the list ascending order
        System.out.println("After sorting: " + list);

        Collections.sort(list, Collections.reverseOrder()); //  comparator - fnx logic Sorting the list descending order
        System.out.println("After sorting: " + list);
    }
}
