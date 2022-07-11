package class26;

public class Demo6 {
    public static void main(String[] args) {
        int num1=10;
        int num2=10;
        int num3=10;
        int num4=10;
        int num5=10;
        System.out.println(num1+num2+num3+num4+num5);

        //whenever we have to store more than 3 values of same type which are also logically connected we should create an array for them

        String name= "Abdulsamad";
        String name1="Kat";
        String name2="Adam";
        String name3="Bilal";
        String [] names={"Abdulsamad", "Kat", "Adam", "Bilal"};

        //not a good fit for an array because data is not same logically;
        String name4= "James";
        String address= "New York";
        String movieName= "Thor";

        String [] arr = {"James", "New York", "Thor"};

        Object[] array= {10, 51.3, "Asghar"};

    }
}
