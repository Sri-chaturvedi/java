package Functionq;

import java.util.Scanner;

// public class function {
//     public static int multiply(int a, int b){

//         return a*b;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int result = multiply(a,b);
//         System.out.println(result);

//     }
// }
// public class function {

//     public static void factorial(int n) {
//         // loop

//         if (n < 0) {
//             System.out.println("Invalid Number");
//             return;
//         }

//         int factorial = 1;
//         for (int i = n; i >= 1; i--) {
//             factorial = factorial * i;
//         }

//         System.out.println(factorial);
//         return;

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         factorial(n);
//     }

// }

// public class function {

//     public static int calculateProduct(int a, int b){
//         return a*b;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         System.out.println(calculateProduct(a, b));
//     }
// }

public class function {
    // Function to check if a number is prime
    public static void isPrime(int n){

        if (n<=1) {
            System.out.println(n + " This is not a Prime Number");
            return;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if (n%i == 0) {
                System.out.println(n + " This is a Not a Prime Number");
                return;
            }

        }
        System.out.println(n + " This is a Prime Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = sc.nextInt();
        isPrime(num);

        sc.close();
    }
}