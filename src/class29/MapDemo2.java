package class29;

import java.util.HashMap;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Integer> groceries = new TreeMap<>();
        groceries.put("Apple",20);
        groceries.put("Watermelon", 25);
        groceries.put("Peach", 20);
        groceries.put("Strawberry", 100);

        HashMap<String, Integer> cosmetics = new HashMap<>();
        cosmetics.put("Foundation", 20);
        cosmetics.put("Lipstick", 25);
        cosmetics.put("Mascara", 20);
        cosmetics.put("Blush", 100);

    }
}
