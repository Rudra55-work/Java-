import java.util.LinkedList;
public class llinjcf {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements to the LinkedList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Displaying the LinkedList
        System.out.println("LinkedList: " + list);

        // Accessing elements
        System.out.println("First Element: " + list.get(0));
        System.out.println("Last Element: " + list.get(list.size() - 1));

        // Removing an element
        list.remove(2); // Removes the element at index 2 (30)
        System.out.println("After removing element at index 2: " + list);

        // Iterating through the LinkedList
        System.out.print("Elements in LinkedList: ");
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
    
}
