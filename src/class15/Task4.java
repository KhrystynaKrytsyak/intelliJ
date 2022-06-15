package class15;

public class Task4 {
    //Create a method that will say Hello in different language based on the country that will
    // pass when method is executed

    void sayHello(String country) {
        String hello;
        switch (country) {
            case "USA":
                hello="Hola";
                break;
            case "Ukraine":
                hello="Dobriy den'";
                break;
            case "France":
                hello="bonjour";
                break;
            case "Pakistan":
                hello="Asalam o Alykum";
                break;
            case "India":
                hello="Namastay";
                break;
            case "Turkey":
                hello="Merhaba";
                break;
            default:
                hello="Country not found";
        }
        System.out.println(hello);
    }
    public static void main (String[] args) {
        Task4 task4=new Task4();
        task4.sayHello("France");
    }
}
