package class27;

import java.util.ArrayList;

public class HWTask4 {
    public static void main(String[] args) {
        //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
        ArrayList <String> drinks = new ArrayList<>();

        drinks.add("Smoothie");
        drinks.add("Juice");
        drinks.add("Detox");
        drinks.add("Seltzer");
        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("Milk");

        for (int i=0; i<drinks.size(); i++) {
            if(drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.set(i, "Water"); //replaced

            }
        }
        System.out.println(drinks);
    }
}
