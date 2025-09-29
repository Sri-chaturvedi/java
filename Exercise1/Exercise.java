package Exercise;

import java.util.Scanner;

public class Exercise {

    // **** */ Qs 1. Enter 3 numbers from the user & make a function to print their
    // average.
    // ** */ Ans ==>>

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // input
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();
    // int average = (a + b + c) / 3;

    // System.out.println("the Average of given numbers is : "+ average);
    // }
    // }
    // **** */ Qs 2. Write a function to print the sum of all odd numbers from 1 to
    // n.
    // ** */ Ans ==>>

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int odd = n/2;
    // int sum=0;

    // System.out.println("this is the sum of 0 to "+ n +" odd numbers ");
    // // print odd number

    // for(int i = 1; i< odd; i++){
    // sum = sum+ (2*i+1);
    // }
    // System.out.println(sum);

    // }
    // }

    // **** */ ==>> 3. Write a function which takes in 2 numbers and returns the
    // greater of those two.

    // public static int getGreater(int a, int b){
    // if (a>b) {
    // return a;
    // }else {
    // return b;
    // }
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // System.out.println(getGreater(a, b));
    // }
    // }

    // **** */ ==>> 4. Write a function that takes in the radius as input and
    // returns the circumference of a circle.

    // public static double getCircumference(double radius){
    // return 2 * 3.14 * radius;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // double radius = sc.nextDouble();

    // System.out.println(getCircumference(radius));
    // }
    // }

    // ***** */==>>> 5. Write a function that takes in age as input and returns if
    // that person is eligible to vote or not. A person of age > 18 is eligible to
    // vote.
    // **** */ ==>>> Ans ==>>

    // public static boolean isEligible(int age) {
    // if (age > 18) {
    // return true;
    // }
    // return false;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int age = sc.nextInt();

    // System.out.println(isEligible(age));
    // }
    // }

    // **** */ ==>>> 6. Write an infinite loop using do while condition.
    // *** */ ==>>> Ans ==>>

    // public static void main(String[] args) {
    // do{

    // System.out.println("Looping forever");
    // } while (true);

    // }
    // }

    // **** */ ==>>> 7. Write a program to enter the numbers till the user wants and
    // at the end it should display the count of positive, negative and zeros
    // entered.
    // *** */ ==>>> Ans ==>>

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int positive = 0;
    // int negative = 0;
    // int zeros = 0;

    // System.out.println("Press 1 to continue or 0 to stop");
    // int input = sc.nextInt();

    // while (input == 1) {
    // System.out.println("Enter your number: ");

    // int number = sc.nextInt();
    // if (number > 0) {
    // positive++;
    // } else if (number < 0) {
    // negative++;
    // } else {
    // zeros++;
    // }

    // System.out.println("Press 1 to continue or 0 to stop");
    // input = sc.nextInt();
    // }

    // System.out.println("\n ----Results----");
    // System.out.println("Positive numbers : " + positive);
    // System.out.println("Negative numbers : " + negative);
    // System.out.println("Zeros : " + zeros);

    // sc.close();// it is not needed for small programs
    // }
    // }

    // **** */ ==>>>8. Two numbers are entered by the user, x and n. Write a
    // function to find the value of one number raised to the power of another i.e.
    // . 𝑥𝑛
    // Try to convert it into a function on your own.

    // *** */ ==>>> Ans ==>>

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter x here : ");
    // int x = sc.nextInt();

    // System.out.println("Enter n here : ");
    // int n = sc.nextInt();

    // int result = 1;

    // for (int i = 0; i < n; i++) {
    // result = result * x ;
    // }
    // System.out.println(" X the power of n is : " + result);
    // }
    // }

    /// **** */ // Try to convert it into a function.

    // public static int getPower(int x, int n){
    // int result = 1;

    // for (int i = 0; i < n; i++) {
    // result = result * x ;
    // }
    // return result;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter x :");
    // int x = sc.nextInt();

    // System.out.println("Enter n :");
    // int n = sc.nextInt();

    // int result = getPower(x, n);

    // System.out.println( x + " for Power "+ n + " is :" + result);
    // }

    // }

    // **** */ Qs ==>> Reverte the numbers which are teken by the user.
    // *** */ Ans ==>>

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter x");
//         int num = sc.nextInt();

//         int r = 0;

//         while (num != 0) {
//             int lD = num % 10;
//             r = r * 10 + lD;
//             num = num / 10;
//         }
//         System.out.println(r);
//     }
// }

// **** */ ==>>>9.Write a function that calculates the Greatest Common Divisor of 2 numbers.

    // *** */ ==>>> Ans ==>>


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n1 = sc.nextInt();
//         int n2 = sc.nextInt();

//         while (n1 != n2) {
//             if (n1>n2) {
//                 n1 = n1 - n2;
//             }else {
//                 n2 = n2 -n1;
//             }
//         }
//         System.out.println("GCD is " + n2);
//     }
// }

    //**** */ ==>>10. Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 21 ..... In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

    //**** */ Ans ==>>
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0; 
        int b = 1;

        System.out.println(a+" ");

        if (n > 1) {
            for (int i = 2; i <= n ; i++) {
                System.out.println(b+ " ");

                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
        }
        sc.close();
    }
}