package Class18;

public class Car {
    String make;
    String model;
    String color;
    public Car(String carMake, String carModel, String carColor){
        make=carMake;
        model=carModel;
        color=carColor;
    }
    void printCarModel(String carModel){
        model=carModel; // it will not work, explained in cartester class.
    }
    void printInfo(){
        System.out.println("CarMake "+make+ " Model "+model+ " Color "+color);
    }// for testing this class, we are going to create carTester class
}
