import java.util.Scanner;
public class inputt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];

        // Input elements into the array
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
    //output the elements of the array
    for(int i=0;i<size;i++){
        System.out.println(numbers[i]);
        sc.close();
        
    
    }
}
}

 

