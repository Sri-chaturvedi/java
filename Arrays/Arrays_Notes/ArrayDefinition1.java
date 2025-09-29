package Arrays.Arrays_Notes;

/*
 Qs. ==> List of the items of the same type
 Example:
   Physics = 97
   Mathematics = 98
   English = 95

 Difining Arrays (Method 1)
*/

public class ArrayDefinition1 {
    public static void main(String[] args) {
        // Defining array of 3 integers
        int marks[] = new int[3];  // also can write: int[] marks = new int[3];

        // Assigning values
        marks[0] = 97; // Physics
        marks[1] = 98; // Mathematics
        marks[2] = 95; // English

        // Printing values
        for (int i = 0; i < 3; i++) {
            System.out.println("Marks[" + i + "] = " + marks[i]);
        }
    }
}
