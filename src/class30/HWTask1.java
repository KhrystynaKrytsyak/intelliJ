package class30;

import java.util.HashSet;

public class HWTask1 {
    public static void main(String[] args) {
        HashSet<String> names=new HashSet<>();
        names.add("John");
        names.add("Jane");
        names.add("James");
        names.add("Jasmine");
        names.add("Jane");
        names.add("James");
        System.out.println(names);
        
    }
}
