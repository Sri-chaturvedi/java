package pArrys;

import java.util.Scanner;

public class pArrys {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int size = sc.nextInt();

    //     int numbers[] = new int[size];

    //     for(int i = 0 ; i< size; i++){
    //         numbers[i]= sc.nextInt();
    //     }
    //     System.out.println("Enter the index x");
    //     int x = sc.nextInt();

    // for(int i = 0 ; i<numbers.length;i++){
    //     if (numbers[i] == x) {
    //         System.out.println("x found at index :" + i);
    //     }
    //     }

    // }


    //** */==>> Take an array of names as input from the user and print them on the screen.

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter number of the names");
    //     int size = sc.nextInt();

    //     String names []= new String[size];

    //     for (int i = 0; i < size; i++) {
    //         names[i]=sc.next();
    //     }
    //     for(int i = 0 ; i<names.length; i++){
    //         System.out.println("name "+ (i+1) + " is " + names[i]);
    //     }
    // }
        
    // }

    //*** */==>>Find the maximum & minimum number in an array of integers.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers to print :");
        int size = sc.nextInt();

        int number[]= new int[size];

        for(int i = 0 ; i<size; i++){
            number[i]=sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i= 0; i<number.length; i++){
            if (number[i] < min) {
                min = number[i];
            }
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("Maximam Number is " + max);
        System.out.println("Minimum Number is " + min);

        sc.close();
    }
}
