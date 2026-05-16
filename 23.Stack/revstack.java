import java.util.Stack;

public class revstack {
    public static void pushAtBottom(Stack<Integer> s, int data){
        //base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        //recursive call
        pushAtBottom(s, data);
        s.push(top);   
    }
    public static void reverseStack(Stack<Integer> s){
        //base case
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        //recursive call
        reverseStack(s);
        //push at bottom
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }


    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //3,2,1
        reverseStack(s);
        printStack(s);
        //1,2,3
    }

}
