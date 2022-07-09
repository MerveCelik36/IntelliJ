package Class23;

public class CarTester {
    public static void main(String[] args) {
        Car car =new Tesla();
        car=new Toyota();//reassign the value
        car.start();

        // this is kinda shortcut, we don't have to write like below.

        /*BMW bmw= new BMW();
        bmw.start();
        bmw.stop();
        bmw.park();
        Tesla tesla=new Tesla();
        tesla.start();
        tesla.stop();
        tesla.park();
        Toyota toyota=new Toyota();
        toyota.start();
        toyota.stop();
        toyota.park();*/

        // we can also create an array to print out all the subclasses.
        Car[] cars={new BMW(),new Tesla(),new Toyota()};

        for (Car c:cars){
            c.start();
            c.stop();
            c.park();
        }

    }
}
