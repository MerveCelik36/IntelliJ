package com.class16;

public class AccessModifierDemo1 {

        private  String password="pass123";
        int ssn=123546;
        public String name="Bilal";


        public  static void main (String[] args) {
            AccessModifierDemo1 ac= new AccessModifierDemo1();
            System.out.println(ac.password);
            System.out.println(ac.ssn);
            System.out.println(ac.name);
        }
}
