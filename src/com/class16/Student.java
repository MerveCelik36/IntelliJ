package com.class16;

public class Student {
    String name;
    int ID;
    static int numberOfStudent=0;
    void setValue(){

        System.out.println("Student name is "+ name+ ". Student ID is "+ID );
    }
    public static void main(String[] args) {
        Student student1= new Student();
        Student student2= new Student();
        Student student3= new Student();
        student1.name="Ayse";
        student1.ID= 101;
        numberOfStudent++;

        student2.name="Fatma";
        student2.ID=102;
        numberOfStudent++;

        student3.name="Hayriye";
        student3.ID= 103;
        numberOfStudent++;

        student1.setValue();
        student2.setValue();
        student3.setValue();
        System.out.println("Total students number is "+numberOfStudent);
    }

}
