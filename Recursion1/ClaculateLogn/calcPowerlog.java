package Recursion1.ClaculateLogn;

public class calcPowerlog {
    public static int printPowerlog(int x, int n ){
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return printPowerlog(x, n/2) * printPowerlog(x, n/2);
        }else{
           return printPowerlog(x, n/2) * printPowerlog(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = printPowerlog(x, n);
        System.out.println(ans);
    }
}
