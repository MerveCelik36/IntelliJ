package Class18;

public class StudentTask5 {
    //Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    // Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students
    // with different marks. Your program should print an average mark of each student's name.
    String name;
    char grade;
    int note1;
    int note2;
    int note3;
    int averageGrade;
    public StudentTask5(){
    }
    public StudentTask5(String StudentTask5Name,int StudentTask5Note1,int StudentTask5Note2,int StudentTask5Note3) {
        name = StudentTask5Name;
        note1 = StudentTask5Note1;
        note2 = StudentTask5Note2;
        note3 = StudentTask5Note3;
        averageGrade = (note1 + note2 + note3) / 3;
        if (averageGrade > 40 && averageGrade < 60) {
           grade='C';
        } else if (averageGrade >= 60 && averageGrade < 80) {
           grade='B';
        } else if (averageGrade >= 80 && averageGrade >= 100) {
         grade = 'A';
        }
    }
       public void print(){
            System.out.println("Student name "+name+ " Student average note is "+averageGrade+ " Grade "+ grade);
        }
    }

