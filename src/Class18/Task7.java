package Class18;

public class Task7 {
    //Write program that have static constructor and observe result.
    static String name;
    static int age;
    public Task7 (String Task7Name, int Task7Age){
        this.name=Task7Name;
        this.age=Task7Age;
    }
    void printInfo(){
        System.out.println("Please enter your name: "+name+ ". Please enter your age: "+age);
    }

    public static void main(String[] args) {
        Task7 person= new Task7("Merve",28);

        person.printInfo();


    }

}
