package Hashing.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HS {
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//list.add(el);

        //Size
        System.out.println("Size of set is : "+ set.size());

        //Print all elements
        System.out.println(set);

        //This Code is not a real comments this code is commented for working of other code⇩⇩

        //Search - contains
    //     if (set.contains(1)) {
    //         System.out.println("Set contains 1");
    //     }
    //     if (!set.contains(6)) {
    //         System.out.println("Does not contains");
    //     }

    //     //Delete
    //     set.remove(1);
    //     if (!set.contains(1)) {
    //         System.out.println("Does not contain 1 - We deleted 1");
    //     }

    //Iterater
    Iterator it = set.iterator();

    while (it.hasNext()) {
        System.out.println(it.next());
    }
 }
}
