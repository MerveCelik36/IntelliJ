package Class15;

public class Homework5 {
    //Create a method createEmail(). Based on values of users name,
    // lastName and email type, your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
    String completeEmail(String name, String lastName, String email){
        return  name + lastName+ "@"+email+".com";
    }

    public static void main(String[] args) {
        Task5 task5= new Task5();
        System.out.println(task5.completeEmail("merve", "celik","gmail" + ""));
    }
}
