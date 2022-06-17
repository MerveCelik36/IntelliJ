package Class18;

import Task6Package.Task6Cls3;

import java.sql.SQLOutput;

public class Task6 {
    //Write a java class that have 4 constructors with 4 different access levels of constructors
    // (private,public,default,protected) and create 4 objects of this class: 1 - inside same class;
    // 2 - from outside the class; 3 - from different class inside different package  and observe result.
      String obj1;
private Task6(String Task6Obj1) {
    obj1= Task6Obj1;}
   protected Task6(int obj2){
    obj2=12;
}

    public static void main(String[] args) {
        Task6 print1=new Task6("Hello");
        System.out.println(print1.obj1);
        Task6 print2= new Task6(12);
        System.out.println(print2);
        Task6Cls2 print3=new Task6Cls2(553);
        Task6Cls3 print4=new Task6Cls3("World");


    }
}