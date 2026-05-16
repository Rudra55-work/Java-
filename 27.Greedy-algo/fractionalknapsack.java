import java.util.*;
public class fractionalknapsack {
    public static void main(String args[]){
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int capacity = 50;

        double ratio[][] = new double[value.length][2];
        //oth col => idx; ist col => ratio
        for(int i=0; i<value.length; i++){
            ratio[i][0] = i; //item number
            ratio[i][1] = (double)value[i]/(double)weight[i]; //value to weight ratio
        }

        //sorting in descending order based on value to weight ratio
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int totalValue = 0;
        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){
                //include full item
                totalValue += value[idx];
                capacity -= weight[idx];
            } else {
                //include fractional item
                totalValue += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println("Maximum value in Knapsack = " + totalValue);
    }
}
