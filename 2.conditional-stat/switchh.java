import java.util.*;

public class switchh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter BUTTON");
        int button = sc.nextInt(); 

        switch(button){
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default : System.out.println("INVALID BUTTON");
            sc.close();
        }
    }
}