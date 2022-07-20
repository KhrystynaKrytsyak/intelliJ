package class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //we can store the object of a class inside a variable of type parent class
        List<String> legends = new ArrayList<>();
        legends.add("Hamid");
        legends.add("Karla");
        legends.add("Naveed");
        legends.add("Tara");
        legends.add("Yusuf");
        System.out.println(legends.size());
        System.out.println(legends.isEmpty()); //false
        System.out.println(legends.contains("Bahram")); // false
        System.out.println(legends.contains("Hamid")); //true
        System.out.println(legends);
        legends.remove("Hamid");
        System.out.println(legends);

        List<String> someStudents = new ArrayList<>();
        someStudents.add("Abdul");
        someStudents.add("Hamid");
        System.out.println(legends.containsAll(someStudents)); // false because not all names are present in legend list
                                                                // true if we change Abdul with any name in the legend List

    }

}
