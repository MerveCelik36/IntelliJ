package Class26;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        //Create an ArrayList that will store 5 names into it.
        //Find out whether the given ArrayList is empty or not?
        //Check whether the specific name is present in an ArrayList or not?
        //Find the size of your arrayList and print all values from that

        ArrayList<String> names=new ArrayList<>();
        names.add("Merve");
        names.add("Ilgin");
        names.add("Kaan");
        names.add("Gamze");
        names.add("Berna");
        System.out.println("Is names array list empty? answer:"+names.isEmpty() );
        System.out.println(" Is array list contains Ilgin element? answer: "+names.contains("Ilgin"));
        System.out.println("What is the array list size? answer: "+names.size());
        System.out.println("Please print out all the values inside the array list: ");
        for (String  i: names){
            System.out.print(i+" ");
        }

    }
}
