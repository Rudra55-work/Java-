import java.util.Stack;
public class stockspanprob {
    public static void stockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0); //pushing index

        for(int i=1; i<stocks.length; i++){
            int currPrice = stocks[i];
            //pop till you find greater price or stack becomes empty
            while(!s.isEmpty() && currPrice >= stocks[s.peek()]){
                s.pop();
            }
            //if stack is empty, it means no greater price on left
            if(s.isEmpty()){
                span[i] = i + 1;
            } else {
                int prevHigh =  s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i); //push current index
        }
    }
    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);

        for(int i=0; i<span.length; i++){
            System.out.print(span[i] + " ");
        }
    }
    
}
