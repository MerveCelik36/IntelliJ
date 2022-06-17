package Class18;

public class Task2 {
    //Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.
   protected String str(String name) {
       String name1 = "";
       for (int i = name.length() - 1; i >= 0; i--) {
           name1 = name1 + name.charAt(i);
       }
       return name1;
   }
    public static void main(String[] args) {
        Task2 print= new Task2();
        System.out.println(print.str("Merve"));
    }


}
