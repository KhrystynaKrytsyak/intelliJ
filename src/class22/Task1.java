package class22;

public class Task1 {
    //Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    //Rectangle
    //Square
    //Box
    //Use separate class to test your code
    void area(int a) {
        System.out.println("The area of rectangle " + a * a);
    }
    void area(int a, int b) {
        System.out.println("The area of square is " + a * b);
    }
    void area(int a, int b, int c) {
        System.out.println("The area of box is " + 2 * a * b + 2 * a * c + 2 * b * c);
    }
}
    class Area {
        public static void main(String[] args) {
            Task1 result = new Task1();
            result.area(5);
            result.area(3, 5);
            result.area(6, 5, 4);
        }
    }


