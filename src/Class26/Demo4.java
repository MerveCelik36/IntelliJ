package Class26;

import java.util.ArrayList;

public class Demo4   {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Zameer");
        names.add("Kevin");
        names.add("Degrees");
        System.out.println(names);
        names.remove( "Kevin");
        System.out.println(names);


    }
}
