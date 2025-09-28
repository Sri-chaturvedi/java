package COnditional_Statements.Leap_Year_Or_Not;

import java.util.Scanner;

public class lyon {
    //leap year or not.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year to check it's Leap year or Not : ");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("This is a Leap year");
        }else{
            System.out.println("this is not a leap year");
        }
        sc.close();
    } 
}
