package Class20;

public class SuperDemo {
    public static void main(String[] args) {


Chair chair=new Chair();
chair.printColor();
}
}
class Furniture {
    String name;
    String color="Black";

}
class Chair extends Furniture{
    String color="grey";
    void printColor(){
        String color="White";
        System.out.println(color);// takes normal variable
        System.out.println(this.color);// takes in chair class
        System.out.println(super.color);// takes from parent class


    }
}