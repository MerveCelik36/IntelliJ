package com.class16;

public class
        SyntaxEmployee {
    int empID;
    double salary;
    static String ceo="Sumair";

    public void setValue(){
        System.out.println("Value of employee ID: "+empID+ "salary is : "+ salary+ ". Ceo of the company is "+ceo);
    }

    public static void main(String[] args) {
        SyntaxEmployee employee1= new SyntaxEmployee();
        SyntaxEmployee employee2= new SyntaxEmployee();

        employee1.empID= 110673;
        employee1.salary=25.950;
        employee2.empID=110674;
        employee2.salary=26.100;
        employee1.setValue();
        employee2.setValue();


    }
}
