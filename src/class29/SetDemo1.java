package class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);

        //when we pass the list to the constructor of the set and java will create a set
        // out of that list using the same approach we get aa list back form the set


        numbers=new ArrayList<>(new LinkedHashSet<>(numbers));
        /* LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>(); //1. creating a set
        linkedHashSet.addAll(numbers); //2.adding all the elements from the list to the set
        numbers=new ArrayList<>(); //3.create a new array
        numbers.addAll(linkedHashSet); //adding unique elements
         */

        System.out.println(numbers);
    }
}
