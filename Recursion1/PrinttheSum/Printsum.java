package Recursion1.PrinttheSum;

//** */==>> Print the sum of first n natural numbers.
public class Printsum {
    // public static void printtheSum(int n , int sum){
    //     if (n == 0) {
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum += n;
    //     printtheSum(n-1, sum);
    // }
    // public static void main(String[] args) {
    //     printtheSum(6, 0);
    // }


    public static void printtheSum(int i , int n, int sum){
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printtheSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        printtheSum(1, 7, 0);
    }
}
