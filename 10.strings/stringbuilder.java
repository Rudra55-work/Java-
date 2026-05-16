public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        //toString
        System.out.println("Original StringBuilder: " + sb.toString());
        
        // Append
        sb.append(" World");
        System.out.println("After Append: " + sb.toString());
        
        // Insert
        sb.insert(5, ",");
        System.out.println("After Insert: " + sb.toString());
        
        // Replace
        sb.replace(0, 5, "Hi");
        System.out.println("After Replace: " + sb.toString());
        
        // Delete
        sb.delete(2, 7);
        System.out.println("After Delete: " + sb.toString());
        
        // Reverse
        sb.reverse();
        System.out.println("After Reverse: " + sb.toString());
        
        // Length
        System.out.println("Length: " + sb.length());

        //charAt index 0
        System.out.println("Character at index 0: " + sb.charAt(0));

        // Set char at index 0
        sb.setCharAt(0, 'X');
        System.out.println("After setting char at index 0: " + (sb.toString()));
    }
    
}
