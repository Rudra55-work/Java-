import java.util.*;
public class indiancoins {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,200,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int amount = 1037;
        int coinCount = 0;
        ArrayList<Integer> usedCoins = new ArrayList<>();
        for( int i=0; i<coins.length; i++){
            if(amount == 0){
                break;
            }
            while(amount >= coins[i]){
                amount -= coins[i];
                coinCount++;
                usedCoins.add(coins[i]);
            }
        }
        
        System.out.println("Minimum number of coins = " + coinCount);
        
        for( int i=0; i<usedCoins.size(); i++){
            System.out.print(usedCoins.get(i) + " ");
        }
        System.out.println();
    }
}
