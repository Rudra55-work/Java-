import java.util.Scanner;

public class Vote {
    public static void age() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = 18;
        age = sc.nextInt();
        if (age<18){
            System.out.println("You are not eligible to vote");
        }
        else{
            System.out.println("You are eligible to vote");
            sc.close();
            
        }

        
    }
    
}
