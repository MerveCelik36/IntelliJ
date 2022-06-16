package Class18;

public class Cow {
    String breed;
    String color;
    int age;
    double weight;
    Cow (String breed, String color, int age, double weight ){//when we have same name variables as
        //local and as instance inside a class, always local variables are preferred over instance variables by java
        this.breed=breed;
        this.color=color;
        this.age=age;
        this.weight=weight;}

        String getCowInfo(){
            return "Breed "+ breed+ " Color "+color+" age "+age+" weight " +weight;

        }
    }


