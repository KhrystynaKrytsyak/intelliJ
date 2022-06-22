package class22;

public class Task3 {
    //Create 1 class with a static method that has 3 overloaded forms.
    //Then call each overloaded method with specific arguments and observe result.

    static void method(String name, int age, char grade) {
        System.out.println("My name is " + name + " "+"I am " + age + " years old"+" and I am a "+grade+" student");
    }
        public static void main(String[] args) {
        Task3.method("Khrystyna",22,'A');
        }
}
