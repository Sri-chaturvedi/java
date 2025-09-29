# 📂 Arrays in Java – Practice and Notes

This folder contains all my Java practice programs and notes related to **Arrays**.  
The programs are organized into subfolders for clarity and better understanding.

---

## 📁 1. Array_Notes
This folder contains basic notes and simple examples that explain how arrays work in Java.  
It includes step-by-step code with comments for better understanding.

- **ArrayInitialization.java** → Shows how to create and initialize arrays.  
- **ArrayInputOutput.java** → Demonstrates how to take input in arrays and print them.  
- **ArrayDefaultValues.java** → Explains default values when memory is allocated.  
- **ArrayMarksExample.java** → Example using Physics, Math, and English marks.  

> ✅ Best for beginners to understand the **fundamentals of arrays**.

---

## 📁 2. Array_Search
This folder contains programs related to **searching in arrays**.

- **ArraySearch.java** → Take an array from the user and search for a given number `x`.  
  Prints the **first index** at which it occurs.  

> Example:  
> Input → `5` (size), array = `4 7 9 7 2`, search `7`  
> Output → `x found at index: 1`

---

## 📁 3. Array_Search_all_Occurrences
This folder contains programs that search for **all occurrences of a number** in an array.

- **ArraySearchAllOccurrences.java** → Take an array and a number `x`, then print **all indexes** where `x` occurs.  

> Example:  
> Input → `6` (size), array = `3 5 7 5 9 5`, search `5`  
> Output →  
> ```
> x found at index: 1  
> x found at index: 3  
> x found at index: 5
> ```

---

## 📝 Notes
- Arrays in Java are **0-based index** (first element at index 0).  
- Default values are assigned when arrays are created (e.g., `int` → 0, `String` → null).  
- You can loop over arrays using `for` loop or `for-each` loop.  
- Searching can be done in two ways:  
  - Stop at the first occurrence.  
  - Find all occurrences.  

---

## 🚀 How to Run
1. Open the project in any Java IDE (IntelliJ / Eclipse / VS Code) or terminal.  
2. Navigate into the folder (e.g., `Array_Search`).  
3. Compile and run the program:  

```bash
javac ArraySearch.java
java ArraySearch
