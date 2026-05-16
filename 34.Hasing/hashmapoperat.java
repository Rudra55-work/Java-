import java.util.HashMap;
public class hashmapoperat {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // Accessing values
        System.out.println("Alice's age: " + map.get("Alice")); // Output: 30

        // Checking if a key exists
        if (map.containsKey("Bob")) {
            System.out.println("Bob's age: " + map.get("Bob")); // Output: 25
        }

        // Removing a key-value pair
        map.remove("Charlie");

        // Iterating over the HashMap
        for (String key : map.keySet()) {
            System.out.println(key);
            System.out.println(key + ": " + map.get(key));
        }
    }
}
