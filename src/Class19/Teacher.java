package Class19;

public class Teacher {
    String name;
    String department;
    int workingYears;
   void display1(){
       System.out.println("please specify the teachers");
   }
}
class MathTeacher extends Teacher{
    MathTeacher(String name , String department, int workingYears) {
        this.name = name;
        this.department = department;
        this.workingYears = workingYears;
    }
        void display2(){
            System.out.println(name+" "+ department+" "+ workingYears);
    }
}
class ChemistryTeacher extends Teacher{
    ChemistryTeacher(String name, String department, int workingYears) {
        this.name = name;
        this.department = department;
        this.workingYears = workingYears;
    }
    void display3(){
        System.out.println(name+" "+department+" "+workingYears);
    }
}
class PianoTeacher extends Teacher{
    PianoTeacher(String name, String department, int workingYears) {
        this.name = name;
        this.department = department;
        this.workingYears = workingYears;
    }
    void display4() {
        System.out.println(name + " " + department + " " + workingYears);

    }
}
class TeacherTester{
    public static void main(String[] args) {
        Teacher print1=new Teacher();
        print1.display1();
        MathTeacher print2=new MathTeacher("April","Math",5);
        print2.display2();
        ChemistryTeacher print3=new ChemistryTeacher("May", "Science",3);
        print3.display3();
        PianoTeacher print4= new PianoTeacher("June", "Art",16);
        print4.display4();

    }
}