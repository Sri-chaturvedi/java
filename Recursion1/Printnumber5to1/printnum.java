package Recursion1.Printnumber5to1;

//** */--> Print number from 5 to 1.

public class printnum {
    public static void printNums(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        printNums(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        printNums(n);
    }
}
