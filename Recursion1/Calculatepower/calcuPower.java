package Recursion1.Calculatepower;

// ** */==>> Print x^n (stack height = n)

public class calcuPower {
    public static int printPower(int x, int n ){
        if (n ==0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xPowernm1 = printPower(x, n-1);
        int xPowern = x * xPowernm1;
        return xPowern;
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = printPower(x, n);
        System.out.println(ans);
    }
}
