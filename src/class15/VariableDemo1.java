package class15;

public class VariableDemo1 {

    String breed; //instance
    static int num=5; // static

    void printName(){
        String name="Local"; // local variable
        System.out.println(name);
    }

    static void printName2(){
        String name="Local"; // local variable
        System.out.println(name);
    }

    public static void main(String[] args) {
        VariableDemo1 v=new VariableDemo1();
        v.printName();
        System.out.println(VariableDemo1.num);
        VariableDemo1.printName2();
    }
}