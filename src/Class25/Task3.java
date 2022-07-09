package Class25;

public class Task3 {//We have to calculate the average of marks obtained in three subjects by student A
    // and in 4 subjects by student B. Create class 'Marks' with an abstract method 'getAverage' that will be returning
    // the average of marks. Provide implementation of abstract method in classes 'A' and 'B'.
    // The constructor of student A takes the marks in three subjects as its parameters and
    // the marks in four subjects as its parameters for student B. Test your code
    public static void main(String[] args) {


        StudentA student1 = new StudentA(50, 60, 80);
        student1.getAverage();
        StudentB student2= new StudentB(50,60,70,80);
        student2.getAverage();
    }
}
abstract class Mark{
    abstract double getAverage();

}
class StudentA extends Mark{
    int averageNote;
    char grade;
    int note1;
    int note2;
    int note3;
    StudentA(int note1, int note2, int note3){
   this.note1=note1;
   this.note3=note3;
   this.note2=note2;
    }


    @Override
    double getAverage() {
        int averageNote= (note1+note2+note3)/3;
        if (averageNote>30 || averageNote<50){
            grade='C';
        }if (averageNote>=50 || averageNote<70){
            grade='B';
        }if (averageNote>=70 || averageNote<=100){
            grade='A';
        }else {
            System.out.println("Grade cannot calculate.");
        }
        System.out.println(" Student A has grade  "+grade + " and average mark of obtain is "+averageNote);
        return grade;
    }
}
class StudentB extends Mark{

    int averageNote;
    char grade;
    int note1;
    int note2;
    int note3;
    int note4;
    StudentB(int note1, int note2, int note3, int note4){
        this.note1=note1;
        this.note3=note3;
        this.note2=note2;
        this.note4= note4;
    }


    @Override
    double getAverage() {
        int averageNote= (note1+note2+note3+note4)/4;
        if (averageNote>30 || averageNote<50){
            grade='C';
        }if (averageNote>=50 || averageNote<70){
            grade='B';
        }if (averageNote>=70 || averageNote<=100){
            grade='A';
        }else {
            System.out.println("Grade cannot calculate.");
        }
        System.out.println(" Student B has "+grade+ " and average mark of obtain is "+averageNote);
        return grade;
    }
}