package Class18;

public class Task3 {
    //Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    // Method should be available inside the class only where it was declared and executed by calling it is name.
    private String str(String name){
        return name.replaceAll("[^AEIOUaeiou]","");
        }

    public static void main(String[] args) {
        Task3 returnVowel=new Task3();
        System.out.println(returnVowel.str("Have A wonderful Day"));
    }
    }



