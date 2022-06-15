package Class15;

public class Homework2 {
    //Create a method that will take a number and
    // prints whether the number is even or odd.
    void evenOrOdd(int x){

        if (x%2==0){
            System.out.println(x+ " is even");
        }else{
            System.out.println(x+ " is odd");
        }
    }

    public static void main(String[] args) {
        Task2 task2= new Task2();
        task2.printEvenOrOdd(16);

    }
}
