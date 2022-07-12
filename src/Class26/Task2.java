package Class26;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        //Create an arraylist of cars and retrieve all the values using 3 different ways.
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Audi");
        //1.way
        System.out.print("Cars on the list: "+ cars+" ");
        System.out.println("");
        //2.way
        System.out.print("Cars on the list : ");
        for (String s: cars){
            System.out.print(s+" ");
        }
        System.out.println(" ");
        //3. way

        System.out.println("Cars on the list: "+cars.subList(0,3));
    }
}