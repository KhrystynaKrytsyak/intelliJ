package class28;

import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        TreeSet<Integer> sortedNums = new TreeSet<>();
        sortedNums.add(1);
        sortedNums.add(10);
        sortedNums.add(12);
        sortedNums.add(2);
        sortedNums.add(3);
        sortedNums.add(3);
        System.out.println(sortedNums);
    }
}
