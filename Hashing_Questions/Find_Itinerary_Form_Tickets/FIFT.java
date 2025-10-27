/*
=====================================================================================
📘 PROGRAM NAME  : Find Itinerary from Tickets
📂 PACKAGE       : Hashing_Questions.Find_Itinerary_Form_Tickets
💡 TOPIC         : HashMap | Graph Traversal | Itinerary Reconstruction
📅 DESCRIPTION   :
   Given a list of airline tickets in the form of (From → To), this program
   reconstructs and prints the complete itinerary in the correct travel order.

=====================================================================================
🎯 OBJECTIVE:
Find the starting point of the journey and print the full travel path.

Example Input:
   Tickets = {
       "Chennai" → "Bengaluru",
       "Mumbai"  → "Delhi",
       "Goa"     → "Chennai",
       "Delhi"   → "Goa"
   }

✅ Output:
   Mumbai → Delhi → Goa → Chennai → Bengaluru

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Create a reverse map (destination → source) for all tickets.  
2️⃣ Find the starting city:
    - A city that is **not present as any destination**.  
3️⃣ Starting from this city, keep following the path using the
    original map (source → destination) until no destination remains.  

=====================================================================================
📊 TIME COMPLEXITY  : O(n)
📊 SPACE COMPLEXITY : O(n)
=====================================================================================
*/

package Hashing_Questions.Find_Itinerary_Form_Tickets;

import java.util.HashMap;

public class FIFT {

    // 🔹 Function to find the starting city of the itinerary
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> reverseTickets = new HashMap<>();

        // 🧩 Step 1: Create reverse mapping (destination → source)
        for (String key : tickets.keySet()) {
            reverseTickets.put(tickets.get(key), key);
        }

        // 🧩 Step 2: Find the city which has no incoming flight
        for (String key : tickets.keySet()) {
            if (!reverseTickets.containsKey(key)) {
                return key; // this is the starting point
            }
        }

        return null; // no valid start found
    }

    // 🔹 Main Method
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        // 🧭 Step 3: Find starting city
        String start = getStart(tickets);

        // 🧾 Step 4: Print complete itinerary
        System.out.println("✈️ Complete Itinerary:");
        while (tickets.containsKey(start)) {
            System.out.print(start + " → ");
            start = tickets.get(start);
        }
        System.out.println(start); // print final destination
    }
}
