package Class26;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {

        //if we have same data type variables which we can call with same name, we can go with arrays instead declare so many
        // different variables.
    /*String name="ali",
    String name1="Veli";
    String name2="Cinali";*/
        String[] name = {"Ali", "veli", "cinali"};
        //Note: an array can take int size of elements, not long, not float, not boolean
        int size = 10;
        String[] arr = new String[size];
        // how we can increase the size??ARRAY LIST!!!

        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names.size());//0
        names.add("Riza");
        names.add("Elif");
        System.out.println(names.size());//2 we add our element without doing anything.

        //Example:
        ArrayList<Integer> numbers=new ArrayList<Integer>(); // we make primitive int
        //Integer to make it non-primitive.
        for (int i=1; i<10; i=i+2){
            numbers.add(i);
        }
        System.out.println(numbers);


    }
}
