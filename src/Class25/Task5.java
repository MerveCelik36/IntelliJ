package Class25;

public class Task5 {
    //Create Registration Class in which you would have variables as email, userName and password that have an access
    // scope only within its own class. After creating an object of the class user should be able to call methods and
    // in each method separately pass values to set users email, username and password.
    /*Requirements:
    Valid email consider to be only yahoo
    Valid userName and password cannot be empty and should be of length larger than 6 characters. Also valid password cannot contain userName.*/
}
class Registration {
    private String email;
    private String userName;
    private String password;
    public void setEmail(String email){
        this.email=email;
        if (email.contains("yahoo")){
            System.out.println("Email address: "+email);
        }else{
            System.out.println("Upps something went wrong!");
        }
    }
    public void setUserName(String userName){
       this.userName=userName;
       if (!userName.isEmpty() && userName.length()>6){
           System.out.println("User Name: "+userName);
       }else{
           System.out.println("Upps something went wrong!");
       }
    }
    public void setPassword(String password){
        this.password=password;
        if (!password.isEmpty() && password.length()>6 && !password.contains(userName)){
            System.out.println("Password: "+password);
        }else{
            System.out.println("Upps something went wrong!");
        }
    }

   public String getEmail(){
        return email;
    }
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }
}
class Test {
    public static void main(String[] args) {


        Registration profile = new Registration();
        profile.setEmail("merve@yahoo.com");
        profile.setUserName("MerveCelik");
        profile.setPassword("MerveCelik1234");
    }

}