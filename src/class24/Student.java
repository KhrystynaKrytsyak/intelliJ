package class24;

public class Student {

    //Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    //Define common behavior within parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Write example of achieving run time polymorphism
        void study() {
            System.out.println("Students must study");
        }
        void doHomeWork(){
            System.out.println("Students should do homeworks");
        }
        void practice() {
            System.out.println("Students must practice");
        }
    }
    class SyntaxStudent extends Student{
        @Override
        void study(){
            System.out.println("Syntax Students must learn programming");
        }

        @Override
        void doHomeWork() {
            System.out.println("Syntax students must solve all repls to get a good job");
        }

        @Override
        void practice() {
            System.out.println("Syntax students must practice to get a good job");
        }
    }
    class CollegeStudent extends Student{
        @Override
        void practice() {
            System.out.println("College students must practice to get good grades");
        }
    }
    class SchoolStudent extends Student{

    }

