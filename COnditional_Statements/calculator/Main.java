
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // take input 
        System.out.println("Enter a number for(a)");
        int a = Sc.nextInt();

        System.out.println("Enter a number for (b)");
        int b = Sc.nextInt();

        System.out.println("Enter your operater");
        char op = Sc.next().charAt(0);

        int result = 0;

        if (op == '+') {
            result= a+b;
            System.out.println(result);
        }else if (op=='-') {
            if (a>=b) {
                result=a-b;
                System.out.println(result);
            }else{
                result=b-a;
                System.out.println(result);
            }
        }else if (op=='*') {
            result=a*b;
            System.out.println(result);
        }else if (op=='/') {
            if (a>=b) {
                result=a/b;
                System.out.println(result);
            }else{
                result=b/a;
                System.out.println(result);
            }
        }else if (op =='%') {
            if (a>b) {
                result = a%b;
                System.out.println(result);
            }else{
                result=b%a;
                System.out.println(result);
            }
        }
    }
}
