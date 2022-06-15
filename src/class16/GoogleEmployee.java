package class16;

public class GoogleEmployee {
    public String name;
    double salary;
    static int noOfEmployees;
    static String companyName = "Google";

    void displayEmployeeInfo() {
        System.out.println("Name " + name + " Salary " + salary + " Company Name " + companyName + " Total Employees " + noOfEmployees);
    }

    public static void main(String[] args) {
        GoogleEmployee emp1 = new GoogleEmployee();
        emp1.name = "Oleg";
        emp1.salary = 250000;
        emp1.noOfEmployees = 1;


        GoogleEmployee emp2 = new GoogleEmployee();
        emp2.name = "Sameer";
        emp2.salary = 250001;
        emp2.noOfEmployees = 2;

        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
    }
}

