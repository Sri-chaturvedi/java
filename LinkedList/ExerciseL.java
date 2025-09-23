package LinkedList;

import java.util.*;

public class ExerciseL {
    // public static void main(String[] args) {
    // LinkedList<Integer> list = new LinkedList<Integer>();

    // //*** */==>> 1. Make a Linked List & add the following elements to it : (1,
    // 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.

    // list.addFirst(1);
    // list.addLast(5);
    // list.addLast(7);
    // list.addLast(3);
    // list.addLast(8);
    // list.addLast(2);
    // list.addLast(3);

    // System.out.println(list);

    // int index = list.indexOf(7); //seach object 7

    // if (index != -1) { //get the index of 7

    // System.out.println("index of 7 is :" + index);
    // }
    // else{
    // System.out.println("there is no 7 in the list");
    // }

    // }

    // *** */==>> 2. Take elements(numbers in the range of 1-50) of a Linked List as
    // input from the user. Delete all nodes which have values greater than 25.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " Numbers (Range 1-50)");

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num >= 1 && num <= 50) {
                list.add(num);
            } else {
                System.out.println("Invailed number please enter between 1 to 50");
                i--;
            }
        }

        System.out.println("Orignal List: " + list);

        list.removeIf(x -> x > 25);
        System.out.println("List after removeing Greater then 25 (>25) : " + list);

        sc.close();
    }
}
