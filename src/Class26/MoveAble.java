package Class26;

public interface MoveAble  {
    void move(); // just head, not body( only declaration, implementation with subclasses)
}
class Car implements MoveAble{

    @Override
    public void move() {
        System.out.println("A car can move");
    }
    public void park(){
        System.out.println("You can park the car");
    }
}
class Person implements MoveAble{

    @Override
    public void move() {
        System.out.println("Humans can also move");
    }
}
class test{
    public static void main(String[] args) {
        MoveAble moveAble= new Car();// widening
        moveAble.move();
        ((Car)(moveAble)).park();// narrowing (child classi parent class'a casting yaptik)
        Person person= new Person();
        person.move();
        // with interfaces, we can also use polymorphism
        MoveAble[] moveAbles= {new Car(), new Person()};
    }
}