package Class15;

public class Task1 {
    //Create a method that will take 2 parameters as a
    // numbers and prints which number is larger.
    void printLarger(int num1, int num2){
        int larger=0;
        if (num1>num2) {
            larger = num1;
        }else if (num2>num1){
            larger=num2;
        }
        System.out.println(larger);
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        task1.printLarger(12,20);
    }
}
