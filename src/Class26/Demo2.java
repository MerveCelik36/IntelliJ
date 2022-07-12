package Class26;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Character> arrayList= new ArrayList<>();
        arrayList.add('a');
        arrayList.add('b');
        arrayList.add('c');
        arrayList.add('d');
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));
        for(int i=0; i< arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
