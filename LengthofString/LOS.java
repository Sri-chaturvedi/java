package LengthofString;

import java.util.Scanner;

public class LOS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println(name.length());
        sc.close();
    }
}
