package TwoDArrays;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int rows = sc.nextInt();
        // int colomns = sc.nextInt();

        // int [][] numbers = new int[rows][colomns];

        // //input
        // //rows
        // for(int i = 0; i<rows; i++){
        //     //colomns
        //     for(int j = 0; j<colomns;j++){
        //         numbers[i][j] = sc.nextInt();
        //     }
        // }

//         //output
//         for(int i = 0; i<rows;i++){
//             for(int j = 0 ; j<colomns;j++){
//                 System.out.print(numbers[i][j]+ " ");
//             }
//             System.out.println();
//         }
//     }
// }


//**** */ Qs ==>> Take a matirx as input from the user. Search for a given number x and print the indices at which it occurs.
//** */ Ans ==> 

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colomns = sc.nextInt();

        int [][] numbers = new int[rows][colomns];

        //input
        //rows
        for(int i = 0; i<rows; i++){
            //colomns
            for(int j = 0; j<colomns;j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for(int i =0; i < rows ; i++){
            for(int j=0; j<colomns;j++){
                //compare with x 
                if (numbers[i][j]==x) {
                    System.out.println("x found at location(" + i +"," + j +")");
                }
            }
        }
        sc.close();
    }
}

