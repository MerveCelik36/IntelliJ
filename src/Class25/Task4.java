package Class25;

public class Task4 {//Create a Class Vehicle that would have the following fields: vehiclePrice and method
    // calculateSalePrice() which should be returning a price of the Vehicle.DONE
    //Create 2 sub classes: Sedan and Truck.DONE The Truck class has field as weight and has its own implementation of
    // calculateSalePrice() method in which returned price calculated as following:
    // if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
   // The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
    //if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
    public static void main(String[] args) {
        Vehicle.vehiclePrice=50000;
        Sedan s= new Sedan();
        s.length= 20;
        System.out.println("Sedan sale price is "+s.calculateSalePrice());
        Truck t=new Truck();
        t.weight=2500;
        System.out.println("Truck sale price is "+ t.calculateSalePrice());
    }
}
class Vehicle{
    static double vehiclePrice;

    public double calculateSalePrice(){
        return vehiclePrice;
    }

}
 class Sedan extends Vehicle{
   double length;
    @Override
    public double calculateSalePrice(){
        if (length > 20) {

            vehiclePrice-=vehiclePrice*0.05;
        }else{
            vehiclePrice-=vehiclePrice*0.1;
        }
        return vehiclePrice;
    }
}
 class Truck extends Vehicle {
     double weight;

     @Override
     public double calculateSalePrice() {
         if (weight > 20000) {
             vehiclePrice -= vehiclePrice * 0.1;
         } else {
             vehiclePrice -= vehiclePrice * 0.2;

         }return vehiclePrice;
     }
 }