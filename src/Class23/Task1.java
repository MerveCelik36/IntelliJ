package Class23;

public class Task1 {
       /*
   Create a class 'Degree' having a method 'getPrerequisite' that prints "".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.
    */
}
class Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{

}
class Master extends Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need Bachelors diploma");
    }
}
class TesterOfDegree{
    public static void main(String[] args) {
        Degree d= new Degree();
        Degree b= new Bachelors();
        Degree m= new Master();
        d.getPrerequisite();
        b.getPrerequisite();
        m.getPrerequisite();

    }
}