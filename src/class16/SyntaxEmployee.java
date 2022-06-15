package class16;

public class SyntaxEmployee {
    //Create a Class called SyntaxEmployee:
    //Create three  variables  empID , salary and set the CEO to “Sumair”
    //Create two objects of the class SyntaxEmployee
    //Set the value of eID, salary for each of the objects
    //Print out the eID , salary and  CEO for each of the objects
    int empID;
    double salary;
    static String ceo="Sumair";

    void printInfo() {
        System.out.println("Your empId is "+empID+" your salary is "+salary+" and CEO for each of the objects is "+ceo);
    }
    public static void main(String[] args) {
        SyntaxEmployee obj1= new SyntaxEmployee();
        obj1.empID=1234;
        obj1.salary=100000;
        obj1.printInfo();

        SyntaxEmployee obj2=new SyntaxEmployee();
        obj2.empID=6546;
        obj2.salary=120000;
        obj2.printInfo();
    }

}
