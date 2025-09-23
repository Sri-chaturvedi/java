// package Sorting.SelectionSorting;

// public class selectionsort {
//     public static void printArry(int arr[]){
//         for(int i = 0; i<arr.length;i++){
//             System.out.print(arr[i] + " " );
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = {7,8,3,1,2};
//         //time complexity = O(n^2)
//         //selectin sort
//         for(int i=0; i<arr.length-1; i++){
//             int smallest = i;
//             for(int j=i+1; j<arr.length; j++){
//                 if (arr[smallest] > arr[j]) { 
//                     smallest =j;
//                 }
//             }
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i] = temp;
//         }
//         printArry(arr);
//     }
// }

package Sorting.SelectionSorting;

public class selectionsort {

    public static void printArry(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 9, 2, 4, 3, 7, 1, 8, 5, 6 };

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArry(arr);
    }
}