package Hashing_Questions.Find_Itinerary_Form_Tickets;

import java.util.HashMap;

public class FIFT {
    public static String getStart(HashMap<String, String> tick){
        HashMap<String, String> revHashmap = new HashMap<>();

        for(String key : tick.keySet()){
            //key -> key ; val -> tick.get(key);
            revHashmap.put(tick.get(key), key);
        }

        for(String key : tick.keySet()){
            if (!revHashmap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets= new HashMap<>();
        tickets.put("Channai", "Bengluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Channai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        while (tickets.containsKey(start)) {
            System.out.print(start+" => ");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
