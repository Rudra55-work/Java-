import java.util.Scanner;

public class declare{
    public static void main(String[] args) {
        String name = "Hello, World!";
        String fullname = "John Doe";
        String sentance = "This is a sample sentence.";
        System.out.println(name+"\n"+fullname+"\n"+sentance);
    Scanner sc = new Scanner(System.in);
    String nameinput = sc.nextLine();
    System.out.println("You entered: " + nameinput);
    sc.close();
    }
}
