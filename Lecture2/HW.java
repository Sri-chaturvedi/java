package Lecture2;
import java.util.Scanner;

public class HW {
    //** */ Qs .1 ==>> Try to declare meaningful variables of each type. Eg - a variable named age should be a numeric type (int or fl oat) not byte.
    
    //** */ Ans ==>>
    
    // public static void main(String[] args) {
    //     String name = "Sri";
    //     int age = 24;
    //     double height = 5.9;
    // }

    //** */ Qs .2. Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.

    //** */ Ans ==>>

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int radius = sc.nextInt();

    //     double area = (radius*radius)*3.14159;
    //     System.out.println(area);
    //     System.out.println(radius);
    // }

    //** */ Qs. 3. Make a program that prints the table of a number that is input by the user.
    //** */       (HINT - You will have to write 10 lines for this but as we proceed in the course you will be studying about ‘LOOPS’ that will simplify your work A LOT!)

    //** */ Ans ==>>

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();

        System.out.println(table*1);
        System.out.println(table*2);
        System.out.println(table*3);
        System.out.println(table*4);
        System.out.println(table*5);
        System.out.println(table*6);
        System.out.println(table*7);
        System.out.println(table*8);
        System.out.println(table*9);
        System.out.println(table*10);
        sc.close();
    }

}
