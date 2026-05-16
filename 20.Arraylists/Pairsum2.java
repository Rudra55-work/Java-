import java.util.ArrayList;

// 2 pointer approach - O(n)
public class Pairsum2 {

    public static boolean Pairsumm(ArrayList<Integer> list, int target) {
        int n = list.size(); 

        // Step 1: Find breaking point
        int bp = -1;
        for (int i = 0; i < n - 1; i++) {   // FIXED HERE
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        // If array is not rotated
        if (bp == -1) {
            bp = n - 1;
        }

        // Step 2: Two pointers
        int lp = (bp + 1) % n; // smallest element
        int rp = bp;           // largest element

        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);

            if (sum == target) {
                return true;
            }

            if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // sorted & rotated array
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        System.out.println(Pairsumm(list, target));
    }
}
