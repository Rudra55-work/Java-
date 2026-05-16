public class towerofhanoi {
    public static void toh(int n, String src, String dest, String helper) {
        //base case
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        //transfer n-1 disks from source to helper using dest as helper
        toh(n - 1, src, helper, dest);
        //transfer nth disk from source to dest
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        //transfer n-1 disks from helper to dest using source as helper
        toh(n - 1, helper, dest, src);
    }

    public static void main(String[] args) {
        int n = 3; //number of disks
        toh(n, "S", "D", "H");
    }
    
}
