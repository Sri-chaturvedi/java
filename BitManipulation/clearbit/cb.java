package BitManipulation.clearbit;

import java.util.Scanner;

public class cb {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your postion here:");
        int pos = sc.nextInt();

        int n = 5;
        // int pos = 2;

        int bitMask = 1<<pos;

        int newbitMask = ~bitMask;

        int newNumber = newbitMask & n;

        System.out.println(newNumber);

        sc.close();
    }
}
