package Class20;

public class Circle extends Shape{
    Circle( int radius){
        super(radius);
    }
    double AreaOfCircle(){
        double area= Math.PI*(radius*radius);
        return area;
    }

    public static void main(String[] args) {
        Circle area= new Circle(40);
        System.out.println(area.AreaOfCircle());
    }
}
