public class allxtoend {
    public static String moveallx(String str, int idx, int countx, String newstr) {
        //base case
        if (idx == str.length()) {
            for (int i = 0; i < countx; i++) {
                newstr += 'x';
            }
            return newstr;
        }
        char currentChar = str.charAt(idx);
        if (currentChar == 'x') {
            countx++;
            return moveallx(str, idx + 1, countx, newstr);
        } else {
            newstr += currentChar;
            return moveallx(str, idx + 1, countx, newstr);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        String result = moveallx(str, 0, 0, "");
        System.out.println(result);
    }
    
}
