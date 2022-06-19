package Class19;

public class Task1Plant {
    // Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.

    String name= "Regular Orchards";
    String color= "white";
    }
    class orchard extends Task1Plant{
        int lifeTime=1;
        void display1(){
            System.out.println(name+" "+color+" "+lifeTime);
        }
       orchard(String name, String color,int lifeTime){
           this.name=name;
           this.color= color;
           this.lifeTime=lifeTime;
       }
}
    class pinkOrchard extends Task1Plant{
    int height;
    void display2(){
        System.out.println(name+" "+ color+" "+height);
    }
    pinkOrchard(String name, String color, int height){
        this.name=name;
        this.color=color;
        this.height=height;
    }
}
    class tester{
        public static void main(String[] args) {
            orchard flower=new orchard("Orchard","White",1);
            flower.display1();
            pinkOrchard flower1=new pinkOrchard("Pink Orchards","pink",6);
            flower1.display2();
        }
    }






