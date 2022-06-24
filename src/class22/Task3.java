package class22;

public class Task3 {
    //Create 1 class with a static method that has 3 overloaded forms.
    //Then call each overloaded method with specific arguments and observe result.

    static void sayHello(String name){
        System.out.println("My name is "+name);
    }
    static void sayHello(int age){
        System.out.println("I am "+age+" years old");
    }
    static void sayHello(String msg, int times){
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
        }
    }
    public static void main(String[] args) {
        sayHello("Zameer stop wasting time on IG",5);
    }
}