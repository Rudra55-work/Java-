public class findlargest {
    public static int largestNum(int numbers[]){
    int largest = Integer.MIN_VALUE;
    int Smallest = Integer.MAX_VALUE;

    for(int i =0; i<=numbers.length-1; i++){
        if(largest < numbers[i]){
            largest = numbers[i];
             
            }
            if(Smallest > numbers[i]){
                Smallest = numbers[i];
            }
        }
            System.out.println("smallest value is : " + Smallest);
            return largest;
            
        
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("largest value is : " + largestNum(numbers));
       
        

    }
    
}
