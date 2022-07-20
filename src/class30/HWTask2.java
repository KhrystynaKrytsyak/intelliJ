package class30;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HWTask2 {
    public static void main(String[] args) {
        //task : Create a Set collection in which you need to add countries of the countries.
        // In this set we want all objects to be sorted in alphabetical order.
        // Using 2 different ways retrieve all elements from set.

        TreeSet<String> countries = new TreeSet<>();
        countries.add("Ukraine");
        countries.add("United States");
        countries.add("Egypt");
        countries.add("Morocco");
        countries.add("Israel");
        countries.add("Malta");
        System.out.println(countries);

        for(String countryName: countries) {
            System.out.println(countryName);

        }
    }
}
