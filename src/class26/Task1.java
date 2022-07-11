package class26;

import java.util.ArrayList;

public class Task1 {
    //create an arrayList and store odd numbers from 1-10
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i < 10; i = i + 2) {
            nums.add(i);
        }
        System.out.println(nums);
    }
}