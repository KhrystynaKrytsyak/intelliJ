package class28;

public class ListDemo {
    public static void main(String[] args) {
        Object[] arr = {"Hamid", 10, 2, "Name"}; //bad programming

        for (Object obj  : arr) {
            System.out.println(((String)obj).length());
        }
    }
}
