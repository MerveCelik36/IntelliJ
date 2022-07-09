package Class14;

public class Task2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*
         * Create a String that should be combination of letters,
         *  numbers and special characters. Find out how many Alphanumeric
         *  characters are there in the String
         */
        String str= "ajweh764593849@%*^(^";
        System.out.println(str.replaceAll("[^A-Za-z1-9]","").length());
    }
}