package Class26;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Milk");
        drinks.add("Tea");
        drinks.add("Gin");
        for (String s: drinks){
            if (s.contains("a") || s.contains("e")){
                System.out.print("Water ");
            }else{
                System.out.print(s+ " ");
            }
        }

    }
}
