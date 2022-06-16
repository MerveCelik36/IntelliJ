package Class18;

public class Cat {
    String breed;
    String color;
    // when we want to print constructor right click-->generate-->constructor-->shift and select all.
    // it will create our public Cat constructor||
                                               //
    public Cat(String breed, String color, int age, double weight) {
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    int age;
    double weight;
}
