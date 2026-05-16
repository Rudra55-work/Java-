
public class addinmid {
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
    //for size of ll
    public static int size;
//add first node
    public void addFirst(int data){
 //step1 : create new node
        Node newNode = new Node(data);
        size++;

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
        size++;

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
                      ////add in mid////
    public void add(int idx,int data){
        //idx=0 addfirst
        if(idx == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i < idx -1){
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    //remove first in ll
    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    //remove last in ll
    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        //find second last node
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    // for iterative search
    public int iteSearch(int key){
        Node temp = head;
    int i = 0;
    while(temp != null){
        if(temp.data == key){//key found
            return i;
        }
        temp = temp.next;
        i++;
    }
    //key not found
    return -1;
    }

    //for iterative search through reccursion
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    // Reverse Linked List
    public void reverse() {
        Node prev = null;
        Node curr = tail= head ;
        Node next = null;

        while (curr != null) {
            next = curr.next;   // store next
            curr.next = prev;   // reverse link
            prev = curr;        // move prev
            curr = next;        // move curr
        }
        head = prev; // new head
    }

    //find and remove nth node from end
    public void deleteNthfromEnd(int n){
        //cal size
        int sz =0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next;//remove first
            return;
        }
        //sz-n th
        int i=1;
        int itofind = sz - n;
        Node prev = head;
        while(i < itofind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {

        addinmid ll = new addinmid(); // corrected

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,9);
    
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.recSearch(9));
        System.out.println(ll.recSearch(10));
        ll.reverse();
        ll.print();
        ll.deleteNthfromEnd(2);
        ll.print();
               System.out.println("Size of linked list: " + ll.size);
    }
}
