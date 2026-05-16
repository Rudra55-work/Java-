import java.util.*;

public class StackUsingDeque {

    static class Stack {
        static Deque<Integer> dq = new LinkedList<>();

        // push
        public static void push(int data) {
            dq.addLast(data);
        }

        // pop
        public static int pop() {
            if (dq.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return dq.removeLast();
        }

        // peek
        public static int peek() {
            if (dq.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return dq.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.peek()); // 3
        System.out.println(s.pop());  // 3
        System.out.println(s.pop());  // 2
        System.out.println(s.pop());  // 1
    }
}
