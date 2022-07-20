package class30;

import java.util.HashMap;
import java.util.Iterator;

public class HWTask5 {
    //Task :Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..).
    // Insert 7 entries with duplicate keys and values.
    //Check how many entries you have?
    //Update company on a 4th floor
    //Remove company on the 7th floor
    //Print your map

    public static void main(String[] args) {
        HashMap<String, Integer> building = new HashMap<>();
        building.put("Google", 3);
        building.put("Syntax", 2);
        building.put("Apple", 2);
        building.put("Dyson", 7);
        building.put("Syntax", 4);
        building.put("LG", 1);
        building.put("Apple", 3);
        System.out.println("There are " + building.size() + " entries");
        System.out.println(building);
        building.replace(String."Syntax","Dyson");



    }
}
