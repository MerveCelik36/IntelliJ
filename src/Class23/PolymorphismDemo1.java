package Class23;

public class PolymorphismDemo1 {

    void doSomething(String name){
        System.out.println("downloading a movie from the internet "+name);
    }

    void doSomething(int num){
        System.out.println("calculating the text based on new rules");
    }
}

class PolyTester{
    public static void main(String[] args) {
        PolymorphismDemo1 p=new PolymorphismDemo1();
        p.doSomething(10);
    }
}
