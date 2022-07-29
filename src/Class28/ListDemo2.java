package Class28;

import java.util.ArrayList;

public class ListDemo2 {
    public static void main(String[] args) {
        ArrayList<Flower> flower=new ArrayList<>();
        flower.add(new Rose());
        flower.add(new Lilly());
        flower.add(new Flower());

        for (Flower flower1 : flower) {
            flower1.bloom();
        }

    }
}
class Flower{
    void bloom(){
        System.out.println("Generally flowers blooming in spring");
    }
}
class Rose extends Flower{
    @Override
    void bloom(){
        System.out.println("Bloom in April");

    }
}
class Lilly extends Flower{
    @Override
    void bloom(){
        System.out.println("Bloom in May");
    }
}