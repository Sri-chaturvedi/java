import java.util.Scanner;

public class Bits {
    

    //** */ Get bit ==>>

    // public static void main(String[] args) {
    //     int n = 5 ; //0101
    //     int pos = 2;
    //     int bitmask = 1<<pos;

    //     if ((bitmask & n) == 0) {
    //         System.out.println("bit was zero");
    //     }else {
    //         System.out.println("bit was one");
    //     }
    // }


    //*** */==>> Set Bit

    // public static void main(String[] args) {
    //     int n = 5 ;
    //     int pos = 1;
    //     int bitmask = 1<<pos;

    //     int newNumber = bitmask | n;
    //     System.out.println(newNumber);
    // }

    //*** */==>> Clear Bit 

    // public static void main(String[] args) {
    //     int n = 5 ;
    //     int pos = 2;
    //     int bitmask = 1<<pos;

    //     int notBitmask = ~(bitmask);

    //     int Clear = notBitmask & n;
    //     System.out.println(Clear);
    // }

    //**** */==>> Update bit

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper = 1 : set , oper = 0 : clear
        int n = 5 ; //0101 -> 0111 -> decimal 7
        int pos = 1;

        int bitmask = 1<<pos;
        if (oper ==1) {
            //set oper
        int newNumber = bitmask | n;
        System.out.println(newNumber);
        }else{
            //clear
            int newBitmask = ~(bitmask);
            int newNumber = newBitmask & n;
            System.out.println(newNumber);
        }
        sc.close();
    }
}
