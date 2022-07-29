package Class28;

import java.util.TreeSet;

public class SetDemo4 {
    public static void main(String[] args) {
        TreeSet<String>letters=new TreeSet<>();
        letters.add("az");
        letters.add("bb");
        letters.add("ca");
        letters.add("dc");
        System.out.println(letters);
        TreeSet<String>letters1=new TreeSet<>();
        letters1.add("z");
        letters1.add("b");
        letters1.add("a");
        letters1.add("q");
        System.out.println(letters1);
    }
}
