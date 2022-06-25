package Class22;

public class Degree {
    //Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
    //Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
    //Call the method by creating an object of each of the three classes.
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{
    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}
class Masters extends Degree{
    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}
class TesterDegree{
    public static void main(String[] args) {
        Masters p1= new Masters();
        p1.getPrerequisite();
        Bachelors p2= new Bachelors();
        p2.getPrerequisite();
        Degree p3= new Degree();
        p3.getPrerequisite();
    }
}