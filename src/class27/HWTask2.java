package class27;

import java.util.ArrayList;
import java.util.Iterator;

public class HWTask2 {
    // Create an arraylist of cars and retrieve all the values using 3 different ways.
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Toyota");
        cars.add("Mustang");
        cars.add("Honda");

        System.out.println(cars);
        System.out.println("_____________________________________________________________________________________");

        for (String car:cars){
        System.out.println(car);
        }
        System.out.println("___________________________________________________________________________________");


        for (int i=0; i<cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        Iterator<String> iterator=cars.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        cars.forEach(System.out::println);   //we didnt learn this but this is also a way

    }
}
