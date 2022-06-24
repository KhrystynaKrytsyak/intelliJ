package class22;

import java.sql.SQLOutput;

public class Task4 {
    //Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.

    private static void method(String name, String lastName) {
        System.out.println("My name is "+name+" my last name is "+lastName);
    }

    private static void method(int age, String color ) {
        System.out.println("I am "+age+" years old and my favorite color is "+color);
    }

    private static void method(char grade) {
        System.out.println("Also I am an "+grade+" student.");
    }
    public static void main(String[] args){
        Task4.method("Khrystyna","Krytsyak");
        Task4.method(25,"black");
        Task4.method('A');
    }
}
