/*
=====================================================================================
📘 PROGRAM NAME  : Convert Integer to String using toString()
📂 PACKAGE       : Strings.ToStringMethod
💡 TOPIC         : Strings | Type Conversion | Wrapper Classes
📅 DESCRIPTION   :
   This program demonstrates how to **convert an integer into a string**
   using the `Integer.toString()` method in Java.

   The `toString()` method is a built-in function that converts numeric 
   values (like int, float, double, etc.) into their **string representations**.

=====================================================================================
🎯 OBJECTIVE:
Convert an integer value into a string so that it can be processed, printed, 
or concatenated like a text value.

Example Input:
   number = 123

Example Output:
   "123"

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Declare an integer variable.
2️⃣ Use the built-in method `Integer.toString(number)` to convert it to a string.
3️⃣ Print or use the converted string as needed.

=====================================================================================
🔹 Example Walkthrough:
   int number = 123;
   String str = Integer.toString(number);
   Output → "123" (as a String)

=====================================================================================
📊 ALTERNATIVE METHODS:
   ✅ String.valueOf(number)
   ✅ "" + number   (String concatenation)
   ✅ new Integer(number).toString()

=====================================================================================
📊 TIME COMPLEXITY:
   O(1) — Simple type conversion (constant time)

📊 SPACE COMPLEXITY:
   O(1) — No extra significant memory used

=====================================================================================
*/

public class ToString {
   public static void main(String[] args) {

      // 🔹 Step 1: Declare an integer variable
      int number = 123;

      // 🔹 Step 2: Convert integer to string using toString()
      String str = Integer.toString(number);

      // 🔹 Step 3: Print the converted string
      System.out.println("Converted String: " + str);
   }
}
