class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class zigzagll {

    // Zig-Zag function
    public void zigZag(Node head) {
        // Base case
        if (head == null || head.next == null) 
            return;

        // 1. Find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // 2. Reverse second half
        Node curr = mid.next;
        mid.next = null; // Split the list into two halves  
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 3. Zig-Zag merge
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while (left != null && right != null) {
            //zig-zag merge
            nextL = left.next;
            nextR = right.next;

            left.next = right;
            right.next = nextL;
            //update
            left = nextL;
            right = nextR;
        }
    }

    // Print function
    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        zigzagll obj = new zigzagll();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        obj.zigZag(head);
        obj.print(head);
    }
}
