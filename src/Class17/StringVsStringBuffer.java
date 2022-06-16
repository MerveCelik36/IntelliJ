package Class17;

public class StringVsStringBuffer {
    public static void main(String[] args) {
        String str= "Java";
        System.out.println(str.replace("a","o")); // "Jovo"
        // here it won't change object str value, just changing during usage below;
        System.out.println(str); //"Java" did not change
        // When you use StringBuffer or StringBuilder, It will change original object.
        StringBuilder str1= new StringBuilder("Java");
        System.out.println(str1.append(" is great")); //"Java is great"
        System.out.println(str1); //"Java is great, original object changes

    }
}
