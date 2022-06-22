package class22;

public class Task4 {
    //Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.

    private static void method(int addressNum, String streetName,long phoneNum) {
        System.out.println("I reside in "+addressNum+ " on "+streetName+" and my phone number is "+phoneNum);
    }
    public static void main(String[] args){
        Task4.method(345,"Broome Street",3472356754l);
    }
}
