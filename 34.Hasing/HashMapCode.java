import java.util.*;

public class HashMapCode {

    static class HashMap<K, V> {  // Generics

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;   // number of nodes
        private int N;   // number of buckets
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // Hash Function
        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        // Search in LinkedList
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {   // ✅ fixed
                    return i;
                }
            }
            return -1;
        }

        // Rehashing
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuckets[] = buckets;

            N = N * 2;  // ✅ update bucket size

            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            n = 0;  // reset size

            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);  // reinsert
                }
            }
        }

        // Put Method
        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {  // key doesn't exist
                buckets[bi].add(new Node(key, value));
                n++;
            } else {  // key exists
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double) n / N;

            if (lambda > 2.0) {   // load factor condition
                rehash();
            }
        }

        // Contains Key
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            return di != -1;
        }

        // Get Method
        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                return null;
            } else {
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        // Remove Method
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                return null;
            } else {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        // Key Set
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }

            return keys;
        }

        // Is Empty
        public boolean isEmpty() {
            return n == 0;
        }

        // Size
        public int size() {
            return n;
        }
    }

    public static void main(String args[]) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);
        map.put("UK", 60);
        map.put("Japan", 80);  // triggers rehash

        ArrayList<String> keys = map.keySet();

        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " -> " + map.get(keys.get(i)));
        }

        System.out.println("Contains India? " + map.containsKey("India"));

        map.remove("India");

        System.out.println("After removing India:");
        System.out.println("India value = " + map.get("India"));
        System.out.println("Size = " + map.size());
    }
}