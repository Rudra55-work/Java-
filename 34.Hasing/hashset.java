import java.util.*;

public class hashset {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();

        int nums[] = {4,3,2,5,6,7,3,4,2,1};
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        System.out.println(set.size());
        System.out.println(set);
    }
    
}
