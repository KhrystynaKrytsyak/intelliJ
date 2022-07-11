package class27;

import java.util.ArrayList;

public class HWTask5 {
    //Create an arrayList of even numbers from 1 to 500.
    // Remove any number that is divisible by 5 from that arrayList.
    public static void main(String[] args) {
    ArrayList<Integer> evenNums = new ArrayList<>();

    for (int i=1; i<500; i++) {
        if (i%2==0) {
            evenNums.add(i);
        }
    }

    for (int i=1; i<evenNums.size(); i++){
        if(evenNums.get(i)%5==0) {
            evenNums.remove(i);

        }
    }
        System.out.println(evenNums);
    }
}
