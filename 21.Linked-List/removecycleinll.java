class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class removecycleinll {
public static void removecycle(Node head){

    //detect cycle
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;

        if(slow == fast){
            cycle = true;
            break;
        }
    }
    if(cycle == false){
        return; // no cycle
    }
    //find meeting point
    slow = head;
    Node prev = null; // to keep track of node before fast
    while(slow != fast){
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }
    //remove cycle
    prev.next = null;
}
// Helper method to print list
   public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next.next;
        removecycle(head);
         printList(head);
        
        }
        
    }
    

    
