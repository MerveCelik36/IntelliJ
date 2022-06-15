package Class15;

public class Homework4 {
    //Create a method that will say Hello in different language based on
    // the country that will pass when method is executed
    void sayHello(String country){
        String hello;
        switch(country){
          case"Turkiye":
              hello="Merhaba";
              break;
          case"Ukraine":
              hello="Privit";
              break;
            default:
        System.out.println("country not found");}
    }

    public static void main(String[] args) {
        Task4 task4= new Task4();
        task4.sayHello("Turkiye");
    }
}
