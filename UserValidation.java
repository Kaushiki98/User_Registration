import java.util.regex.Pattern;

public class UserValidation {
    private static final String Name = "^[A-Z][a-z]{2,}$";
    private static final String EmailID = "^[A-Z0-9a-z.%+-]+@[A-Za-z0-9 .\\-]+\\.[A-Za-z]{2,6}";
    private static final String PhoneNumber = "[91]+[ ]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]";
    private static final String Password = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}";

    // WELCOME MESSAGE
    public static void main(String args[]) {
        System.out.println("Welcome user registration system");
    }
    //VALIDATE LAST NAME
    public boolean firstNameValidation(String FirstName) {
        Pattern pattern = Pattern.compile(Name);
        boolean res = pattern.matcher(FirstName).matches();
        return res;
    }
    //VALIDATE LAST NAME
    public boolean lastNameValidation(String LastName) {
        Pattern pattern = Pattern.compile(Name);
        boolean res = pattern.matcher(LastName).matches();
        return res;
    }
    //EMAIL VALIDATION
    public boolean emailValidation(String Email) {
        Pattern pattern = Pattern.compile(EmailID);
        boolean res = pattern.matcher(Email).matches();
        return res;
    }
    //MOBILE NUMBER VALIDATION
    public boolean PhoneValidation(String PhoneNum) {
        Pattern pattern = Pattern.compile(PhoneNumber);
        boolean res = pattern.matcher(PhoneNum).matches();
        return res;
    }
    //PASSWORD VALIDATION
    public boolean passwordValidation(String Pass) {
        Pattern pattern = Pattern.compile(Password);
        boolean res = pattern.matcher(Pass).matches();
        return res;
    }
}
