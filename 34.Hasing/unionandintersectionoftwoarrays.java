import java.util.HashSet;

public class unionandintersectionoftwoarrays {

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {4, 5, 6, 7, 8};

        // ---------------- UNION ----------------
        HashSet<Integer> set = new HashSet<>();

        // Add elements of arr1
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        // Add elements of arr2
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println("Union: " + set);

        // ---------------- INTERSECTION ----------------
        HashSet<Integer> set2 = new HashSet<>();

        // Store elements of arr1
        for (int i = 0; i < arr1.length; i++) {
            set2.add(arr1[i]);
        }

        System.out.print("Intersection: ");
        for (int i = 0; i < arr2.length; i++) {
            if (set2.contains(arr2[i])) {
                System.out.print(arr2[i] + " ");
            }
        }
    }
}