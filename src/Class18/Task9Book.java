package Class18;

public class Task9Book {
    //Write Book class that will have instance variables and 2 Constructors.
    // While creating an object make sure:
    //Instance variables are being initialized
   // Both Constructors are being executed
    String bookName;
    String author;
    int year;

    Task9Book (){
        year=1862;
        System.out.println("Book has been published on "+year);
    }
    Task9Book (String bookName, String author){
        this.bookName=bookName;
        this.author=author;
        System.out.println("Book name is "+ bookName+". Author name is "+author);
    }

    public static void main(String[] args) {
        Task9Book print=new Task9Book("Miserables","Victor Hugo");
        Task9Book print2=new Task9Book();

    }
}
