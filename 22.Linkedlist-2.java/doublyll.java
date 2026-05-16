public class doublyll {
    public class Node {
        int data;
        Node next;
        Node prev;

         public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

     // Add node at the first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    //remove first
    public int removeFirst() {
        if (size == 0) {
            System.out.println("DLL is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    //add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }   

    //remove last
    public int removeLast() {
        if (size == 0) {
            System.out.println("DLL is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    //print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        doublyll dll = new doublyll();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(4);
        dll.addFirst(5);
        dll.print(); // Output: 5<->4<->1<->2<->3<->null
            dll.removeFirst();
        dll.print(); // Output: 2 3
            dll.removeLast();
        dll.print(); // Output: 2 3 4
            dll.addLast(6);
        dll.print(); // Output: 2 3 4 6

        System.out.println("dll size: " + size); // Output: dll size: 3
        
    }
}
