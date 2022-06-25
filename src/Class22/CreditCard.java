package Class22;

public class CreditCard {
    //Create a class CreditCard and define variable balance and interest.
    // Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
    double balance;
    int period;
    double interest;
    void calculate(double balance, double interest, int period){
        System.out.println("Interest rate based on information's is: "+balance*(1+ interest*period));
    }
}
class Visa extends CreditCard{
    void calculate(double balance, double interest, int period) {
        System.out.println("Interest rate based on information's is: "+balance * (1 + interest * period));
    }
}
class AMEX extends CreditCard{
    void calculate(double balance, double interest, int period) {
        System.out.println("Interest rate based on information's is: "+balance * (1 + interest * period));
    }
}
class TesterCreditCard{
    public static void main(String[] args) {
        AMEX p1= new AMEX();
        p1.calculate(1000.50,0.5,36);
        Visa p2= new Visa();
        p2.calculate(205843582,.60,72);

    }
}