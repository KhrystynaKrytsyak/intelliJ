package reviewclass8;

public class Doctor {
    String firstName, lastName, speciality;
    int experience;
    double salary;

    static String hospital;

    Doctor(String firstName,String lastName) {
    this.firstName=firstName;
    this.lastName=lastName;

    }
    Doctor(String firstName, String lastName, String speciality, int experience) {
    this(firstName, lastName);
    this.speciality=speciality;
    this.experience=experience;
    }
    void printInfo() {
        System.out.println("Doctor name is "+firstName+" "+lastName);

        void work() {
            System.out.println();
        }

    }
}

