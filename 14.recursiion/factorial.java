import java.util.Scanner;

public class factorial {
    public static int calcfactorial(int n) {
        //base case
        if(n == 0 || n == 1) {
            return 1;
        }
        //recursive call
        int fact_nm1 = calcfactorial(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scannedNumber = sc.nextInt();
        int n = scannedNumber;
    
        int result = calcfactorial(n);
        System.out.println("Factorial of "+ n +" is "+ result);
        sc.close();
    }
    
}
