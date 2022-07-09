package Class25;

interface DDR3{
    void read();
    void write();
}

public interface DDR4 extends DDR3{ 
    void speed();
}
class SamsungRam implements DDR4{
    public void read(){
        System.out.println("reading speed is now 3GB/s");
    }
    public void write(){

        System.out.println("writing speed is now 3GB/s");
    }
    public void speed(){
        System.out.println("extra speed  of 1GBp/s");
    }

}