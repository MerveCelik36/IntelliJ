package Class26;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> subject=new ArrayList<>();
        subject.add("SDLC");// index of 0 if reverse index of 4( .reverse();)
        subject.add("Manuel Testing");
        subject.add("Java");
        subject.add("Git");
        subject.add("Selenium");
        System.out.println(subject.indexOf("Java"));//2
        System.out.println(subject.size());//5 finding how many element is there
        System.out.println(subject.remove(4));// does not give what we want, try this;
        subject.remove(2);
        System.out.println(subject);
        System.out.println(subject.remove("Git"));// does not remove it, try this;
        subject.remove("Git");
        System.out.println(subject );
        System.out.println(subject.contains("Java"));// false
        subject.add(1,"Jira");
        System.out.println(subject);// we don't lose SDLC , it just becomes 2. index
        System.out.println(subject.get(1));
        subject.clear();// will remove all elements
        System.out.println(subject);
    }
}

