package Class21;

public class HW3 {
   // Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    static void HW(){
        System.out.println("Who likes homeworks?");
    }
    static void HW(String name){
        System.out.println(name+ " likes homeworks.");
    }
    static void HW(String name, int number){
        System.out.println(name+ " can do "+ number+ " homeworks in a day!");
    }

    public static void main(String[] args) {
        HW3 p1= new HW3();
        p1.HW();
        HW3 p2=new HW3();
        p2.HW("Kayla");
        HW3 p3=new HW3();
        p3.HW("Kayla",1000);

    }
}
