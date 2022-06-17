package Class18;

public class Task8 {
    //Write a Student class   that have instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given  student using displayInfo method.
    String name;
    String address;
    public Task8 (String Task8Name, String Task8Address){
        name=Task8Name;
        address=Task8Address;
    }
    void displayInfo(){
        System.out.println("Student name is "+name+" and student adress is "+address);
    }

    public static void main(String[] args) {
        Task8 student=new Task8("Alice", "Houston");
        student.displayInfo();
    }
}
