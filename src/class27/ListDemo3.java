package class27;

import java.util.ArrayList;

public class ListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> legends = new ArrayList<>(); //recommended
        legends.add("Hamid"); //0
        legends.add("Karla"); //1
        legends.add("Yusuf"); //2
        legends.add("Naveed"); //3
        legends.add("Yusuf");  //4
        legends.add("Tara"); //5
        legends.add("Herbert"); //6
        legends.add("Yusuf"); //7
        legends.add("Yusuf"); //8
        System.out.println(legends.get(4));
        System.out.println(legends.get(2));
        System.out.println(legends);

        legends.set(0, "Hamid Jan"); //replaces an index
        System.out.println(legends);
        System.out.println(legends.indexOf("Yusuf")); //gives you an index of element
        System.out.println(legends.lastIndexOf("Yusuf")); //last Index

        System.out.println(legends.subList(0,3));


    }
}
