package Class18;
public  class AppleClassTask4 {
    //Write a java class that will have a constructor: one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.

   String type;
     String taste;
    String color;

    public AppleClassTask4(){

    }

    public AppleClassTask4(String AppleClassTask4Type,String AppleClassTask4Taste, String AppleClassTask4Color) {
        type = AppleClassTask4Type;
        taste = AppleClassTask4Taste;
        color = AppleClassTask4Color;
    }

    void printInfo() {
        System.out.println("Type " + type + " Taste " + taste + " Color " + color);
    }


}
