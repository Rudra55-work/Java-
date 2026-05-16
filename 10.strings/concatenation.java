public class concatenation {
    public static void main(String[] args) {
        String firstName = "Rudra";
        String lastName = "Verma";
        String fullName = firstName + " " + lastName;

        //length
        System.out.println("Full Name: " + fullName.length());

        //charat
        for(int i=0;i<fullName.length();i++){
            System.out.println("Character at index "+i+" : "+fullName.charAt(i));

            //compareto
            if(firstName.compareTo(lastName)==0){
                System.out.println("Both names are equal");
            } else {
                System.out.println("Names are not equal");    
                
                //substring
                String sub = fullName.substring(0,5);   
                System.out.println("Substring (0-5): " + sub);
            
        }
    }
}
    }

