import java.util.*;
public class validanagram {
    public static void main(String[] args){
        String s = "race";
        String t = "care";

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1); 
        }

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            }else{
                System.out.println("Not Anagram");
                return;
            }
        }

        if(map.size()==0){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
