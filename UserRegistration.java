import java.util.regex.*;

public class UserRegistration
{
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+(([\\.+-][a-z0-9]{1,})?)+@(?:[a-zA-Z0-9])+\\.[a-zA-Z]{2,4}+((\\.[a-z]{2,4})?)$";
    private static final String MOBILE_PATTERN = "[91]+[ ]+[0-9]{10}";
    private static final String PASSWORD4_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,10}$";

    public boolean validateFirstName(String firstName) throws userValidationException {
        try {
            Pattern pattern = Pattern.compile(NAME_PATTERN);
            boolean res = pattern.matcher(firstName).matches();
            return res;
        } catch (Exception e) {
            throw new userValidationException("Invalid Entry!");
        }
    }

    public boolean validateLastName(String lastName) throws userValidationException {
        try {

            Pattern pattern = Pattern.compile(NAME_PATTERN);
            boolean res = pattern.matcher(lastName).matches();
            return res;
        } catch (Exception e) {
            throw new userValidationException("Invalid Entry!");
        }
    }

    public boolean validateEmail(String email) throws userValidationException {
        try {

            Pattern pattern = Pattern.compile(EMAIL_PATTERN);
            boolean res = pattern.matcher(email).matches();
            return res;
        } catch (Exception e) {
            throw new userValidationException("Invalid Entry!");
        }
    }

    public boolean validateMobileNo(String mobileNumber) throws userValidationException {
        try {

            Pattern pattern = Pattern.compile(MOBILE_PATTERN);
            boolean res = pattern.matcher(mobileNumber).matches();
            return res;
        } catch (Exception e) {
            throw new userValidationException("Invalid Entry!");
        }
    }

    public boolean validatePassword(String password) throws userValidationException {
        try {

            Pattern pattern = Pattern.compile(PASSWORD4_PATTERN);
            boolean res = pattern.matcher(password).matches();
            return res;
        } catch (Exception e) {
            throw new userValidationException("Invalid Entry!");
        }
    }
}
