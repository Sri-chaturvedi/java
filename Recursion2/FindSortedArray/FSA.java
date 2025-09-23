package Recursion2.FindSortedArray;

public class FSA {
    public static boolean isSorted(int arr[], int idx){
        if (idx == arr.length-1) {
            return true;
        }
        //fist mathod 

        // if (arr[idx]>= arr[idx+1]) {
        //     return false;
        // }
        // return isSorted(arr, idx+1);

        // secound mathod to do 
        
        if (arr[idx] < arr[idx +1]) {
            return isSorted(arr, idx+1);
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 6 };
        System.out.println(isSorted(arr, 0));
    }
}
