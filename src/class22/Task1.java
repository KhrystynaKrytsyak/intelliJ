package class22;

public class Task1 {
    //Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    //Rectangle
    //Square
    //Box
    //Use separate class to test your code
    void area(int a, int b) {
        System.out.println("The area of rectangle " + a * b);
    }
    void area(int a) {
        System.out.println("The area of square is " + a * a); //square's sides are equal thats why we use only one int num
    }
    void volume(int a, int b, int c) {
        System.out.println("The volume of box is " + a*b*c);
    }
}
    class Area {
        public static void main(String[] args) {
            Task1 result = new Task1();
            result.area(5);
            result.area(3, 5);
            result.volume(6, 5, 4);
        }
    }


