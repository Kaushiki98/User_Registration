import java.util.regex.Pattern;

public class UserValidation {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[A-Z0-9a-z.%+-]+@[A-Za-z0-9 .\\-]+\\.[A-Za-z]{2,6}";
    private static final String MOBILE_PATTERN = "[91]+[ ]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]";
    private static final String PASSWORD_PATTERN = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}";

    // WELCOME MESSAGE
    public static void main(String args[]) {
        System.out.println("Welcome user registration system");
    }
    //VALIDATE LAST NAME
    public boolean firstNameValidation(String FirstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        boolean res = pattern.matcher(FirstName).matches();
        return res;
    }
    //VALIDATE LAST NAME
    public boolean lastNameValidation(String LastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        boolean res = pattern.matcher(LastName).matches();
        return res;
    }
    //EMAIL VALIDATION
    public boolean emailValidation(String Email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        boolean res = pattern.matcher(Email).matches();
        return res;
    }
    //MOBILE NUMBER VALIDATION
    public boolean mobileValidation(String MobileNo) {
        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        boolean res = pattern.matcher(MobileNo).matches();
        return res;
    }
    //PASSWORD VALIDATION
    public boolean passwordValidationRule(String Password1) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        boolean res = pattern.matcher(Password1).matches();
        return res;
    }
}
