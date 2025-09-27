package COnditional_Statements.Get_Week;

import java.util.Scanner;

public class gw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Day on week(1-7):");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
            System.out.println("Invaild Number of Day (Try Again)");
                break;
        }
        sc.close();
    }
}
