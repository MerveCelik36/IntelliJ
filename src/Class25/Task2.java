package Class25;

public class Task2 {
    //Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
    // Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
    public static void main(String[] args) {
        Circle c= new Circle(2.4);
        c.calculatedArea();
        c.calculatePerimeter();
        Square s= new Square (5  );
        s.calculatedArea();
        s.calculatePerimeter();

    }
}
interface Shape{
    double calculatedArea();
    double calculatePerimeter();
}
class Circle implements Shape{
   double radius;
   Circle(double radius){
       this.radius=radius;
   }
    @Override
    public double calculatedArea() {
      double area=Math.PI * radius * radius;
        System.out.println("Area of circle is "+area);
       return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter =Math.PI * 2 * radius;
        System.out.println("Perimeter of circle is "+perimeter);
        return perimeter;
    }
}
class Square implements Shape {
 int side;
  Square (int side){
      this.side=side;
  }
    @Override
    public double calculatedArea() {
        int area= side*side;
        System.out.println("Area of square is "+area);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        int perimeter= side*4;
        System.out.println("Perimeter of square is "+perimeter);
        return perimeter;
    }
}
