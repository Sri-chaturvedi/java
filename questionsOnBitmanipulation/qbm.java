package questionsOnBitmanipulation;

import java.util.Scanner;

public class qbm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        if (num<=0) {
            System.out.println("Number should be greater then 0");
        }else{
            if ((num & (num -1)) == 0) {
                System.out.println(num + " is a power of 2");
            }else{
                System.out.println(num + " is not a power of 2");
            }
            sc.close();
        }
    }
}
