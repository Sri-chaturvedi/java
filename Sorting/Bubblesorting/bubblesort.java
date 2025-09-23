// package Sorting.Bubblesorting;

// public class bubblesort {
//     public static void printArry(int arr[]){
//         for(int i = 0; i<arr.length;i++){
//             System.out.print(arr[i] + " " );
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = {7,8,3,1,2};

//         //time complexity = O(n^2)
//         //bubble sort
//         for(int i =0 ; i<arr.length-1;i++){  // n-1
//             for(int j =0; j<arr.length-i-1; j++){
//                 if (arr[j] > arr[j+1]) {
//                     //swap
//                     int temp = arr[j];
//                     arr[j]= arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }

//         printArry(arr);
//     }
// }


package Sorting.Bubblesorting;

public class bubblesort {

    public static void printArry(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {9,5,7,2,4,6,1};

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
         printArry(arr);

    }

}