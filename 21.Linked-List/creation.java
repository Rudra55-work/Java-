
public class creation {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
//head tail creation
    public static Node head;
    public static Node tail;

//add first node
    public void addFirst(int data){
 //step1 : create new node
        Node newNode = new Node(data);
        

 //case1 : if ll is empty
        if(head == null){
            head = tail = newNode;  
            return;
        }
//case2 : ll is not empty
//step2 : newNode next = head
        newNode.next = head; //linked
 //step3 : head = newNode
        head = newNode;
    }
//add last node
    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        creation ll = new creation(); // corrected

        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}
