package Class19;

import Class20.Laptop;

public class AppleLaptop extends Laptop {

    void printMake() {
        System.out.println(make);// can't access because we are in different class package
        // if its default it would work.
    }
}