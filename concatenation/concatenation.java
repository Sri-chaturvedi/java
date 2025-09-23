package concatenation;

import java.util.Scanner;

public class concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //concatenation
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        sc.close();
        
    }    
}
