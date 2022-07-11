package class26;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> subjectsSeen = new ArrayList<>();
        subjectsSeen.add("SDLC");
        subjectsSeen.add("Manual");
        subjectsSeen.add("Java");
        subjectsSeen.add("Git");
        subjectsSeen.add("Selenium");

        ArrayList<String> futureSubjects=new ArrayList<>();
        futureSubjects.add("TestNG");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("API");
        futureSubjects.add("Docker");
        futureSubjects.add("AWS");
        futureSubjects.add("Jenkins");
        futureSubjects.add("APIUM");

        ArrayList <String> allSubjects = new ArrayList<>();
        allSubjects.addAll(subjectsSeen);
        allSubjects.addAll(futureSubjects);
        System.out.println("allSubject = " + allSubjects);

        ArrayList <String> allSubjects2 = new ArrayList<>(); //shift +end to select the complete line
        allSubjects.addAll(subjectsSeen);
        //insert data starting from index 1 and will push the existing data towards the end
        allSubjects.addAll(1,futureSubjects);


    }
}
