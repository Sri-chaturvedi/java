package Patterns;

// import java.util.*;

public class Patterns {
    public static void main(String[] args) {

        // *** */ 1.Qs ==>> Print the Patterns

        // *****
        // *****
        // *****
        // *****
        // *****

        // Ans.==>>

        // int n = 4;
        // int m = 5;
        // // outer loop
        // for(int i = 1; i<= n; i++){
        // //inner loop
        // for(int j = 1; j<= m ; j++){
        // System.out.print("*");
        // }
        // System.out.println("*");
        // }

        // *** */ 2.Qs ==>> Print the Patterns
        // *****
        // *   *
        // *   *
        // *   *
        // *****

        // Ans.==>>

        // int n = 4;
        // int m = 5;
        // // outer loop
        // for (int i =1; i<=n;i++){
        //     //inner loop
        //     for(int j = 1;j<=m;j++){
        //         //call -> (i,j)
        //         if(i == 1 || j ==1 || i == n || j == m ){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // *** */ 3.Qs ==>> Print the Patterns
        
        // *
        // **
        // ***
        // ****

        // Ans.==>>

        // int n = 4;

        // //outer loop
        // for(int i = 1; i<= n; i++){
        //     //inner loop
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


         // *** */ 4.Qs ==>> Print the Patterns
        
        // ****
        // ***
        // **
        // *

        // Ans.==>>


        // int n = 4;

        // //outer loop
        // for(int i = n; i>=1; i--){
        //     //inner loop
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // *** */ 5.Qs ==>> Print the Patterns

        //Inverted Half Pyramid
        
        //    *
        //   **
        //  ***
        // ****

        // Ans.==>>

        // int n = 4;

        // // outer loop 

        // for(int i = 1; i<=n; i++){

        //***//inner loop --> space print 

        //     for(int j =1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }

        //     // inner loop --> star print 

        //     for(int j =1; j<=i; j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }


         // *** */ 6.Qs ==>> Print the Patterns

        //half pyramid with numbers

        // 1
        // 12
        // 123
        // 1234
        // 12345

        // Ans.==>>

        // int n = 5;

        // //outer loop

        // for(int i =1; i<=n; i++){

        //     // inner loop

        //     for(int j=1; j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // *** */ 7.Qs ==>> Print the Patterns

        //half pyramid with numbers

        // 12345
        // 1234
        // 123
        // 12
        // 1

        // Ans.==>>

        // int n = 5;
        
        // //outer loop

        // for(int i=1; i<=n;i++){

        //     //inner loop

        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // *** */ 8.Qs ==>> Print the Patterns

        //Floyd's Triangle

        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        // Ans.==>>

        // int n = 5;
        // int number = 1;

        // //outer loop

        // for(int i = 1; i<=n; i++){

        //     //inner loop

        //     for(int j=1; j<=i; j++){
        //       System.out.print(number + " " );
        //       number++;// number = number + 1 
        //     }

        //     System.out.println();

        // }


        // *** */ 9.Qs ==>> Print the Patterns

        //0-1 Triangle

        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        // Ans.==>>

        // int n = 5;

        // //outer loop 
        // for(int i = 1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         int sum = i+j;
        //         if (sum % 2 == 0) { //Even
        //             System.out.print("1 ");
        //         }else{//Odd
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }


        // *** */ 10.Qs ==>> Print the Patterns

        //Butterfly Pattrn

        // *             *
        // * *         * *
        // * * *     * * *
        // * * * * * * * *
        // * * * * * * * *
        // * * *     * * *
        // * *         * *
        // *             *


        // Ans.==>>

        // int n = 5;

        // //Upper Half

        // for(int i =1; i<=n; i++){
        //     //1st part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }

        //     //spaces
        //     int spaces = 2 * (n-i);
        //     for(int j = 1; j<=spaces;j++){
        //         System.out.print(" ");
        //     }
        //     //2nd part stars
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //Lower Half

        //  for(int i=n; i>=1; i--){
        //     //1st part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }

        //     //spaces
        //     int spaces = 2 * (n-i);
        //     for(int j = 1; j<=spaces;j++){
        //         System.out.print(" ");
        //     }
        //     //2nd part stars
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // *** */ 11.Qs ==>> Print the Patterns

        //Solid Rhombus

        //         * * * * *
        //       * * * * *
        //     * * * * *
        //   * * * * *
        // * * * * *

        // Ans.==>>

        // int n = 5;

        // //outer loop
        // for(int i =1; i<=n; i++){
        //     //Spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     //Stars 
        //     for(int j=1; j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        
        // *** */ 12.Qs ==>> Print the Patterns

        //Number Pyramid

        //         1 
        //        2 2 
        //       3 3 3 
        //     4 4 4 4 4
        //   5 5 5 5 5 5 5

        // Ans.==>>

        // int n =5;

        // for(int i = 1; i<= n; i++){
        //     //spaces
        //     for(int j =1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     //numbers - Printing Row number, row number times
        //     for(int j =1; j<=i; j++){
        //         System.out.print(i+ " ");
        //     }
        //     System.out.println();
        // }

        // *** */ 13.Qs ==>> Print the Patterns

        // Palindromic Pattern

        //         1 
        //       2 1 2 
        //     3 2 1 2 3
        //   4 3 2 1 2 3 4
        // 5 4 3 2 1 2 3 4 5

        // Ans.==>>

        // int n =5;

        // //outer loop
        // for(int i =1; i<=n;i++){
        //     //spaces

        //     for(int j =1; j<=n-i;j++){
        //         System.out.print(" ");
        //     }

        //     //1st half numbers
        //     for(int j=i; j>=1; j--){
        //         System.out.print(j);
        //     }
        //     //2nd half numbers

        //     for(int j =2; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }



    // *** */ 13.Qs ==>> Print the Patterns

        // Diamond Pattern

        //           *
        //         * * * 
        //       * * * * *
        //     * * * * * * *
        //     * * * * * * *
        //       * * * * *
        //         * * * 
        //           *

        // Ans.==>>

        int n = 4;

        //upper half
        for(int i = 1; i<= n; i++){
            //spaces
            for(int j =1; j<= n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j =1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //Lower half
        for(int i = n; i>= 1; i--){
            //spaces
            for(int j =1; j<= n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j =1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
