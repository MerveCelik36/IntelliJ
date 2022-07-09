package Class23;

public class Student {
    /*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
            Define some methods specific to child classes
            Write example of achieving run time polymorphism*/
    //overriding is run time polymorphism. overloading is compile time polymorphism.
    void studentInfo(){

    }
}
class SyntaxStudent extends Student{
    @Override
    void studentInfo(){
        System.out.println("Studying is fun");
    }
}
class CollageStudent extends Student{
    @Override
    void studentInfo(){
        System.out.println("Are you sure??");
    }
}
class SchoolStudent extends Student{
    @Override
    void studentInfo(){
        System.out.println("Just joking");
    }
}
class TesterStudent{
    public static void main(String[] args) {
        Student [] students={new SyntaxStudent(), new CollageStudent(),new SchoolStudent()};
        for (int i = 0; i < students.length; i++) {
            students[i].studentInfo();

        }
    }
}