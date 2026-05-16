import java.util.*;
public class queuereversal {
    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        //step 1: push all elements of queue into stack
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        //step 2: pop all elements from stack and add to queue
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Original Queue: " + q);
        reverseQueue(q);
        System.out.println("Reversed Queue: " + q);
    }
}