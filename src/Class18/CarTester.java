package Class18;

public class CarTester {
    public static void main(String[] args) {
        Car car1=new Car("Audi","Etron GT","Black");

            car1.printInfo();
        Car car2= new Car("Toyota","Camry", "White");

            car2.printInfo();
       //  Car car=new Car("Tesla"); it is not allowed to have two constructor in a class
        //with same number of parameters and same type


    }
}
