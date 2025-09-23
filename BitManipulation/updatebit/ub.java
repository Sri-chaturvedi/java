package BitManipulation.updatebit;

import java.util.Scanner;

public class ub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your operation");
        int oper = sc.nextInt();

        //oper = 1 -> setbit Operation , oper = 0 -> clearbit operation
        
        int n = 5;
        int pos = 1;

        int bitMask = 1<<pos;

        if (oper == 1) {
            //set 
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            int notBitmask = ~bitMask;
            int newNumber = notBitmask & n;
            System.out.println(newNumber);
        }
        sc.close();
    }
}
