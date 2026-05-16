import java.util.*;
public class dequeusingJCF {
    public static void main(String args[]){
        Deque<Integer> dq = new LinkedList<>();
        //addFirst
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        System.out.println(dq); //3 2 1

        //addLast
        dq.addLast(4);
        dq.addLast(5);
        System.out.println(dq); //3 2 1 4 5

        //removeFirst
        dq.removeFirst();
        System.out.println(dq); //2 1 4 5

        //removeLast
        dq.removeLast();
        System.out.println(dq); //2 1 4

        //get/peekFirst
        System.out.println(dq.getFirst()); //2

        //peekLast
        System.out.println(dq.peekLast()); //4
    }
    
}
