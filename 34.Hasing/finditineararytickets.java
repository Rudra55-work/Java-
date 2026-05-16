import java.util.*;

public class finditineararytickets {

    // Function to find the starting point of the journey
    public static String getStart(HashMap<String, String> map){

        // Reverse map to store destination -> source
        HashMap<String,String> revMap = new HashMap<>();

        // Build reverse map
        for(String key : map.keySet()){
            revMap.put(map.get(key), key);
        }

        // The start city will not appear as a destination
        for(String key : map.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }

        return null; // required if no start found
    }

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("Chennai", "Bangalore");
        map.put("Bombay", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        // Find starting city
        String start = getStart(map);

        System.out.print(start);

        // Follow the path using the map
        while(map.containsKey(start)){
            System.out.print(" -> " + map.get(start));
            start = map.get(start);
        }

        System.out.println();
    }
}