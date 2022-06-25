package Class21;

 class Programming {
   // Create a class named 'Programming'. While creating an object of the class,
    // if nothing is passed to it, then the message "" should be printed.
    // If some String is passed to it, then in place of "programming languages" the value variable should be printed.
    // Example, if we pass "Java", then "I love Java" should be printed.

     Programming (){
         System.out.println("I love programming languages");// constructor does not pass anything, no parameter
     }
     Programming(String name){// has parameter
         System.out.println(" I love "+name);
     }

     public static void main(String[] args) {
         Programming print=new Programming();
         Programming print2=new Programming("Java");

     }
}
