package Class27;

import java.util.ArrayList;

public class ListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> legends= new ArrayList<>(); //recommended
        legends.add("Hamid");
        legends.add("Karla");
        legends.add("Naveed");
        legends.add("Tara");
        legends.add("Yusuf");
        ArrayList<String> moreStudent= new ArrayList<>();
        moreStudent.add("Jason");
        moreStudent.add("Handan");
        ArrayList<String>allStudents= new ArrayList<>();
        allStudents.addAll(legends);
        allStudents.addAll(moreStudent);
        System.out.println(allStudents);
        allStudents.clear();
        System.out.println(allStudents);

    }
}
