import java.util.Scanner;

public class gb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        
        int n = 5;
        // int pos = 1;

        int bitMask = 1<<pos;
        
        if ((bitMask & n) == 0) {
            System.out.println("bit is zero");
        }else{
            System.out.println("bit is one");
        }
        sc.close();
    }
}
