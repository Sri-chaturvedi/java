package COnditional_Statements.Calculater2;

import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number for (a): ");
        double a = sc.nextDouble(); 
        System.out.print("Enter Number for (b): ");
        double b = sc.nextDouble();

        System.out.println("\nChoose an operation:");
        System.out.println("1 : + (Addition) a + b");
        System.out.println("2 : - (Subtraction) a - b");
        System.out.println("3 : * (Multiplication) a * b");
        System.out.println("4 : / (Division) a / b");
        System.out.println("5 : % (Modulo or remainder) a % b");

        System.out.print("Enter Operator (1-5): ");
        int oper = sc.nextInt();

        double result;

        switch (oper) {
            case 1:
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
                break;

            case 2:
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
                break;

            case 3:
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
                break;

            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println(a + " / " + b + " = " + result);
                } else {
                    System.out.println("Division with zero is not possible.");
                }
                break;

            case 5:
                if (b != 0) {
                    result = a % b;
                    System.out.println(a + " % " + b + " = " + result);
                } else {
                    System.out.println("Modulo with zero is not possible.");
                }
                break; // 

            default:
                System.out.println("Invalid choice! Please enter between 1-5.");
        }

        sc.close();
    }
}
