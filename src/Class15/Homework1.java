package Class15;

public class Homework1 {
    //Create a method that will take 2 parameters as a
    // numbers and prints which number is larger.
    void printParameters( int x, int y){

        if (x >  y){
            System.out.println(x+ " is the largest number");
        }else{
            System.out.println(y+ " is the largest number");
        }

    }

    public static void main(String[] args) {
        Task1 task1= new Task1();
        task1.printLarger(20,50);

    }
}
