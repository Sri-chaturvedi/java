package L3ConditionalStatements;

import java.util.Scanner;

public class homeW {

    // ** */ Qs. ==>> 1. Make a Calculator. Take 2 numbers (a & b) from the user and
    // an operation as follows :
    // ● 1 : + (Addition) a + b
    // ● 2 : - (Subtraction) a - b
    // ● 3 : * (Multiplication) a * b
    // ● 4 : / (Division) a / b
    // ● 5 : % (Modulo or remainder) a % b
    // Calculate the result according to the operation given and display it to the
    // user.

    // ** */ Ans ==>>

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter your first number here :");
    //     int a = sc.nextInt();
    //     System.out.println("Enter your Secound number here :");
    //     int b = sc.nextInt();
    //     System.out.println("Enter your Operater here :");
    //     char operaters = sc.next().charAt(0);

    //     if (operaters == '+') {
    //         System.out.println(a+b);
    //     }else if (operaters == '-') {
    //         if (a>b) {
    //             System.out.println(a-b);
    //         }else{
    //             System.out.println(b-a);
    //         }
    //     }else if (operaters == '*') {
    //         System.out.println(a*b);
    //     }else if (operaters == '/') {
    //         if (a>b) {
    //             System.out.println(a/b);
    //         }else{
    //             System.out.println(b/a);
    //         }
    //     }else if (operaters == '%') {
    //         if (a>b) {
    //             System.out.println(a%b);
    //         }else{
    //             System.out.println(b%a);
    //         }
    //     }
    // }

    // ** */ Qs. ==>> 2. Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

    //** */ Ans. ==>> 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the month :");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Febuary");
                break;
                case 3:
                System.out.println("March");
                break;
                case 4:
                System.out.println("April");
                break;
                case 5:
                System.out.println("May");
                break;
                case 6:
                System.out.println("June");
                break;
                case 7:
                System.out.println("July");
                break;
                case 8:
                System.out.println("Augest");
                break;
                case 9:
                System.out.println("September");
                break;
                case 10:
                System.out.println("October");
                break;
                case 11:
                System.out.println("November");
                break;
                case 12:
                System.out.println("Decmeber");
                break;
            default:
            System.out.println("undifind");
                break;
        }
        sc.close();
    }
}
