package Class18;

public class CowTester {
    public static void main(String[] args) {
        Cow cow=new Cow("Australian","Black",20,120.50);
        System.out.println(cow.getCowInfo()); // null 0,00 will be the result that's why we use "this."
    }
}
