package Class20;

public class UserInfo extends UserClass{
    String address;
    UserInfo(String name, long phoneNumber, String address) {
        super(name, phoneNumber);
        this.address=address;
    }
    void UserDetails(){
        System.out.println(name+" "+phoneNumber+" "+ address);
    }

    public static void main(String[] args) {
        UserInfo print= new UserInfo("Tanya", 2136589475632l, "Ukraine");
        print.UserDetails();
    }
}
