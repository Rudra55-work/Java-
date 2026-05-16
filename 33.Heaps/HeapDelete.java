import java.util.*;

public class HeapDelete {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // Add (Insert)
        public void add(int data) {
            arr.add(data);

            int x = arr.size() - 1;   // child index
            int par = (x - 1) / 2;    // parent index

            while (x > 0 && arr.get(x) < arr.get(par)) {
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        // Heapify (Min Heap)
        private void heapify(int i) {
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        // Remove (Delete Root)
        public int remove() {
            int data = arr.get(0);

            // step 1: swap first & last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step 2: remove last
            arr.remove(arr.size() - 1);

            // step 3: heapify
            heapify(0);

            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String args[]) {
        Heap pq = new Heap();

        pq.add(3);
        pq.add(1);
        pq.add(2);
        pq.add(5);

        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
