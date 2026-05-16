import java.util.ArrayList;
public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        // Adding elements to the ArrayLists o(1) time complexity
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(1, 2);
        list2.add("Hello");
        list3.add(true);
        list3.add(false);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        // Accessing elements from the ArrayLists o(1) time complexity
        int num = list1.get(0); // Access first element of list1
        System.out.println(num);

        //remove elements from the ArrayLists o(n) time complexity
        list1.remove(1); // Remove element at index 1 from list1
        System.out.println(list1);

        //setting elements in the ArrayLists o(1) time complexity
        list1.set(0, 10); // Set first element of list2 to "World"
        System.out.println(list1);

        //contains method o(n) time complexity
        System.out.println(list1.contains(10)); // Check if list1 contains 10
        System.out.println(list1.contains(2)); // Check if list1 contains 2

        //size method o(1) time complexity
        System.out.println(list1.size()); // Get the size of list1

        //print the arraylist
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }

    

    } 
    
}
