package Class24;

public abstract class Phone {
    abstract void displayPictures();
    abstract void unlock();

}
class Iphone extends Phone{
    @Override
    void displayPictures(){
        System.out.println("Use the photos app to display the pictures");
    }
    @Override
    void unlock(){
        System.out.println("Use FaceID to unlock the phone");
    }
    void sendText(){
        System.out.println("Use the message app to send message");
    }
}
class Samsung extends Phone{

    @Override
    void displayPictures() {
        System.out.println("Use the Gallery to display the pictures");
    }

    @Override
    void unlock() {
        System.out.println("Use fingerprint to unlock your Samsung");
    }
}
class Tester{
    public static void main(String[] args) {
        Samsung samsung= new Samsung();
        samsung.displayPictures();
    }
}