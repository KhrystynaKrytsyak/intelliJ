package class27;

import java.util.ArrayList;

public class HWTask3 {
    //Create an arrayList of words. Remove every word that ends with “e”.

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("bottle");
        words.add("sea");
        words.add("table");
        words.add("fruit");
        words.add("computer");
        words.add("napkin");

        for(int i=0; i<words.size(); i++) {
            if (words.get(i).endsWith("e")){
                words.remove(i);
            }
        }
        System.out.println(words);
    }
}
