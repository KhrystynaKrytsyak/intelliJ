package class18;

public class Task1 {
    //Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    //Method should be visibly only within same package and accessible by the creating an instance of the class.

    int sum;

    int sum(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Task1 printSum = new Task1();
        int[] arr = {1, 2, 3, 4};
        System.out.println(printSum.sum(arr));
    }
}