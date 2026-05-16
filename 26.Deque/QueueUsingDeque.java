import java.util.*;

public class QueueUsingDeque {

    static class Queue {
        Deque<Integer> dq = new LinkedList<>();

        // isEmpty
        public boolean isEmpty() {
            return dq.isEmpty();
        }

        // add (enqueue)
        public void add(int data) {
            dq.addLast(data);
        }

        // remove (dequeue)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return dq.removeFirst();
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return dq.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.peek());   // 1
        System.out.println(q.remove()); // 1
        System.out.println(q.remove()); // 2
        System.out.println(q.remove()); // 3
    }
}
