package Exercise1.Eligible_To_Vote;

import java.util.Scanner;

/*
---------------- Example Output ----------------

Input: 20
Output:
Eligible to vote

Input: 16
Output:
Not eligible to vote

-----------------------------------------------
Explanation:
- Voting age is 18 years or above.
- The method isEligible checks if the given age meets the criteria.
*/

public class EligibleToVote {

    // Method to check voting eligibility
    public static void isEligible(int age) {
        if (age < 18) {
            System.out.println("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.close();

        // Call the method
        isEligible(age);
    }
}
