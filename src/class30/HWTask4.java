package class30;

import java.util.HashMap;

public class HWTask4 {
    public static void main(String[] args) {
        //Task:Create a Set collection that will hold Objects of Student Type.
        // In this set we do not care about the insertion order.
        // Each student object should have name and studentID. Display name of each student

        HashMap<String, Integer> student = new HashMap<>();
        student.put("John", 1);
        student.put("Emily", 2);
        student.put("Rob", 3);
        student.put("Stephanie", 4);
        student.put("Jason", 5);
        System.out.println(student.keySet());
    }
}
