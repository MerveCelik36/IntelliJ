package Class20;

import java.sql.SQLOutput;

public class Vehicle {
    int engineHP;
    String make;
    String model;
    String color;

}
class car extends Vehicle {
    String steeringType;
    boolean autoPilot;
    int noOfWindows;

    void printBasicInfo() {
        engineHP = 500;
        System.out.println(engineHP);
    }

}
class BMW extends car{
    int topSpeed;
    void printBasicInfo(){
        engineHP=500;
        System.out.println(engineHP);
    }
}