package Class21;

public class HW1 {
    /*Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    Rectangle
    Square
    Box
    Use separate class to test your code*/
    int length;
    int width;

    void rectangle(int length,int width){
        System.out.println("Area of rectangle is: "+ length*width);
    }
    void square(int length){
        System.out.println("Area of square is: "+ length*length);
    }
    void box (int length,int width, int height){
        System.out.println("Volume of box is: "+ length*width*height);
    }
}
class TesterHW extends HW1{
    public static void main(String[] args) {
        HW1 rectangle= new HW1();
        rectangle.rectangle(10,20);
        HW1 square=new HW1();
        square.square(40);
        HW1 box=new HW1();
        box.box(10,20,30);

    }


}