public class remdupli {
    public static String removeduplicate(String str, int idx, String newstr, boolean map[]) {
        //base case
        if (idx == str.length()) {
            return newstr;
        }
        char currentChar = str.charAt(idx);
        if (map[currentChar - 'a'] == true) {
            return removeduplicate(str, idx + 1, newstr, map);
        } else {
            newstr += currentChar;
            map[currentChar - 'a'] = true;
            return removeduplicate(str, idx + 1, newstr, map);
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        boolean map[] = new boolean[26];
        String result = removeduplicate(str, 0, "", map);
        System.out.println(result);
    }   
    
}
