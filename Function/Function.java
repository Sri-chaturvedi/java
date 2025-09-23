package Function;
import java.util.*;


//**** */ 1. Print a given name in a function.

//** */ ==>> Ans

// public class Function {
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         printMyName(name);//call kiya function ko
//     }
// }


//**** */ 2. Make a function to add 2 numbers and return the sum.

//** */ ==>> Ans

 public class Function {
    // public static int calculateSum(int a, int b){
    //     int sum = a +b;
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int sum = calculateSum(a, b);
    //     System.out.println("Sum of two numbers is "+ sum);
    // }


//**** */ 3. MAke a function to multiply 2 numbers and return the product.

//** */ ==>> Ans 


// public static int calculateProduct(int a, int b){
//     return a * b;
// }
// public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         System.out.println("Product of two numbers is "+ calculateProduct(a, b));
//     }
// }

//**** */ 4. Find a factorial of a number.

//** */ ==>> Ans 

public static void calculateFactorial (int n){
    //loop
    if (n < 0) {
        System.out.println("Invaild Number");
        return;
    }
    int factorial = 1;

    for(int i = n; i>=1; i--){
        factorial = factorial * i;
    }
    System.out.println(factorial);
    return;// No need of (return) here if we are using (void - return type)
}
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        calculateFactorial(n);
 sc.close();
    }
}