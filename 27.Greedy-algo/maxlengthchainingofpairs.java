import java.util.*;
public class maxlengthchainingofpairs {
    public static void main(String args[]){
        int pairs[][] = {{5,24}, {15,25}, {27,40}, {50,60}};
        
        //sorting based on second element of pairs
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));
        
        int chainLength = 1; //at least one pair can be included
        int lastIncludedPairEnd = pairs[0][1];
        
        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0] > lastIncludedPairEnd){
                chainLength++;
                lastIncludedPairEnd = pairs[i][1];
            }
        }
        
        System.out.println("Maximum length of chain = " + chainLength);
    }
}
 