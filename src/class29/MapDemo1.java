package class29;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 2000.0); //auto upcasting does not work with the wrappers
        fruit.put("Orange", 20.5);
        fruit.put("Kiwi", 10.2);
        fruit.put("Banana", 10.2);
        fruit.put("Apple", 10.5);
        System.out.println(fruit);
        System.out.println(fruit.get("Kiwi"));
        System.out.println(fruit.remove("Orange"));
        System.out.println(fruit);
        System.out.println(fruit.containsKey("Kiwi"));
        System.out.println(fruit.containsValue(10.2));
        System.out.println(fruit.isEmpty());
        fruit.replace("Kiwi",15.2);
        System.out.println(fruit);
        fruit.put(null, null); //  there will be no issue if inserting in with HasMap but there will be issue in TreeMap
        System.out.println(fruit);


    }
}
