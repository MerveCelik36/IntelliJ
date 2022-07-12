package Class26;

import java.util.ArrayList;

public class Demo9 {
    public static void main(String[] args) {
        Integer number=10;
        System.out.println(Integer.MAX_VALUE);
        int num= Integer.parseInt("20");
        System.out.println(num);
        System.out.println(Integer.MIN_VALUE);
        int number1=15;
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(number1);// auto boxing
        System.out.println("numbers = "+numbers);
        int number3= numbers.get (0);// auto unboxing


    }
}
