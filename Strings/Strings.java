package Strings;

// import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // String Declearation ==>>

        // String name = "Sri";
        // String fullName = " Sri Chaturvedi";
        // String sentence = " My Name is Sri Chaturvedi";

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is : " + name);

        // *** */ Concatenation ==>>

        // String firstName = "Srii";
        // String lastName = "Chaturvedi";
        // String fullName = firstName +"@"+ lastName;
        // System.out.println(fullName);

        // **** */ Length ==>>

        // String firstName = "Srii";
        // String lastName = "Chaturvedi";
        // String fullName = firstName + lastName;
        // //SriiChaturvedi
        // System.out.println(fullName.length());

        // //*** */charAt==>>

        // for (int i =0; i<fullName.length(); i++) {
        // System.out.println(fullName.charAt(i));
        // }

        // *** */ compare ==>>

        // String name1 = "Sri";
        // String name2 = "Chaturvedi";

        // 1 s1 > s2 : +ve value
        // 2 s1 == s2 : 0
        // 3 s1 < s2 : -ve value

        // if (name1.compareTo(name2) == 0) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("String are not equal");
        // }


        //*** */ SubString==>

        // String sentence = "My name is Sri";
        // // substring(beg index, end index)
        // String name = sentence.substring(11, sentence.length());
        // System.out.println(name);

        // String sentence = "SriChaturvedi";
        // // substring(beg index, end index)
        // String name = sentence.substring(3 );
        // System.out.println(name);

        //Strings are Immutable : most important topic and question
    
    
        //*** */ STRINGBUILDERS ===>>>>

        // StringBuilder sb = new StringBuilder("Srii");
        // System.out.println(sb);

        // //char at index 0

        // System.out.println(sb.charAt(0));

        // //set char at index 0

        // sb.setCharAt(0, 'p');
        // System.out.println(sb);

       //*** */ for insert index

        // sb.insert(0, 'P');
        // System.out.println(sb);

        //** */ Delete the extra 'n'

        // sb.delete(2, 4);
        // System.out.println(sb);

        //*** */ ==>> append use for String
        // StringBuilder sb = new StringBuilder("h");
        // sb.append("e"); //str = str + "e";
        // sb.append("l"); //str = str + "l";
        // sb.append("l");
        // sb.append("o");
        // System.out.println(sb);

        //** */ length for stringbuilder

        // StringBuilder sb = new StringBuilder("h");
        // sb.append("e"); 
        // sb.append("l");
        // sb.append("l");
        // sb.append("o");
        // System.out.println(sb.length());

        //*** */ ==>> Qs =>> reverse the string

        StringBuilder sb = new StringBuilder("hello");

        for (int i = 0; i < sb.length()/2; i++) {
            int front =i;
            int back = sb.length() - i - 1; //5-1-0 = >4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}