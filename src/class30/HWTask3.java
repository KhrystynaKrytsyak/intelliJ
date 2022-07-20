package class30;

import org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HWTask3 {
    //Task:Create a Set of cities in which you want to make sure that insertion order is maintained.
    // Then remove any city that starts with “A”;
    public static void main(String[] args) {

        LinkedHashSet <String> cityName = new LinkedHashSet<>();
        cityName.add("Barcelona");
        cityName.add("Stockholm");
        cityName.add("Paris");
        cityName.add("Amman");
        cityName.add("Barcelona");
        cityName.add("Antananarivo");

        cityName.removeIf(nat->nat.startsWith("A"));
        System.out.println(cityName);


            }
        }