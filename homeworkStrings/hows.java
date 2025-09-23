package homeworkStrings;

import java.util.Scanner;

//**** */===>>> 1. Take an array of Strings input from the user & fi nd the cumulative (combined) length of all those strings.

// public class hows {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         String array[]= new String[size];

//         int totLength = 0;

//         for(int i = 0 ; i<size; i++){
//             array[i]= sc.nextLine();

//             totLength += array[i].length();

//         }

//         System.out.println(totLength);
//     }
// }

//*** */==>>> 2. Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
// Example :
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”

// public class hows {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String name = sc.nextLine();

//         String result = "";

//         for(int i = 0 ; i< name.length(); i++){
//             if (name.charAt(i) == 'e') {
//                 result += 'i';
//             }else{
//                 result += name.charAt(i);
//             }
//         }
//         System.out.println(result);
//     }
// }

//*** */==>>>3. Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
            // Example :
            // email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
            // email = “helloWorld123@gmail.com”; username = “helloWorld123”

public class hows {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String email = sc.nextLine();

        String username = "";

        for(int i = 0; i<email.length(); i++){
            if (email.charAt(i)== '@') {
                break;
            }else{
                username += email.charAt(i);
            }
        }
        System.out.println(username);

        sc.close();
    }
}