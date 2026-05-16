import java.util.*;
public class usingJCF {
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>(); //Queue is an interface so we cannot create object of it directly
         //LinkedList implements Queue interface
        //ArrayDeque also implements Queue interface
         //add
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

    
}
