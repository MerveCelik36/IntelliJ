package Class19;

public class Task2ClassA {
    //Write program to inherit class A that has method printF
    // which is static and call or reuse that method into class B
    static void methodF(){
        System.out.println("call this method");
    }
}
class B extends Task2ClassA{
    public static void main(String[] args) {
        B print=new B();
        print.methodF();

    }

}