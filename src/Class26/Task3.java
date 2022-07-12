package Class26;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class Task3 {
    public static void main (String[]args){
        //Create an arrayList of words. Remove every word that ends with “e”.
        ArrayList<String> names= new ArrayList<>();
        names.add("cute");
        names.add("day");
        names.add("nice");
        names.add("sunny");
        for (String s:names){
           if (s.endsWith("e")){
               System.out.print("");
            }else{
                System.out.println(s);
            }
        }




    }
}
