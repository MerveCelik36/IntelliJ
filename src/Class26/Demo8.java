package Class26;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> subjectsSeen= new ArrayList<>();
        subjectsSeen.add("SDLC");// index of 0 if reverse index of 4( .reverse();)
        subjectsSeen.add("Manuel Testing");
        subjectsSeen.add("Java");
        subjectsSeen.add("Git");
        subjectsSeen.add("Selenium");

        ArrayList<String>futureSubjects= new ArrayList<>();
        futureSubjects.add("TestNG");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("API");
        futureSubjects.add("Jenkins");
        futureSubjects.add("AWS");
        futureSubjects.add("Docker");
        futureSubjects.add("APIUM");
        //let's say we want to combine these two different list

        ArrayList<String> allSubjects= new ArrayList<>();
        allSubjects.addAll(subjectsSeen);
        allSubjects.addAll(futureSubjects);
        System.out.println(("allSubjects= "+allSubjects ));






    }
}
