import java.util.Stack;

public class nextgraterelement {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for( int i=arr.length-1; i>=0; i--){
            int curr = arr[i];//for index i
            //pop till you find greater element or stack becomes empty
            while(!s.isEmpty() && curr >= s.peek()){
                s.pop();
            }
            //if stack is empty, no greater element on right
            if(s.isEmpty()){
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = s.peek();
            }
            s.push(curr); //push current element
        }
        //print next greater array
        for(int i=0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
    
}
