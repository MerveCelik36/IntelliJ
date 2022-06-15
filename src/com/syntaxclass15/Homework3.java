package com.syntaxclass15;

public class Homework3 {
    //Create a method that will print whether given String is palindrome or not.
    void palindrome(String name){
        String reverse="";
        for (int i=name.length()-1; i>=0; i--) {
            reverse = String.valueOf(name.charAt(i));
            if (reverse.equals(name)) {
                System.out.println(name + " is palindrome");
            } else {
                System.out.println(name + " is not palindrome");
            }
        }
    }

    public static void main(String[] args) {
        Task3 task3= new Task3();
        task3.printIsPalindrome("mama");
    }
}
