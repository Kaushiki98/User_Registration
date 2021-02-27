import java.util.regex.*;
@FunctionalInterface
interface UserValidate {
    boolean validate(String str);
}
public class UserRegistration
{
    private static final String Name = "^[A-Z][a-z]{2,}$";
    private static final String Email = "^[a-zA-Z0-9]+(([\\.+-][a-z0-9]{1,})?)+@(?:[a-zA-Z0-9])+\\.[a-zA-Z]{2,4}+((\\.[a-z]{2,4})?)$";
    private static final String PhoneNumber = "[91]+[ ]+[0-9]{10}";
    private static final String Password = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,10}$";

    UserValidate FirstName = (str) -> (Pattern.compile(Name).matcher(str).matches());
    UserValidate LastName = (str) -> (Pattern.compile(Name).matcher(str).matches());
    UserValidate EmailID = (str) -> (Pattern.compile(Email).matcher(str).matches());
    UserValidate PhoneNum = (str) -> (Pattern.compile(PhoneNumber).matcher(str).matches());
    UserValidate Pass = (str) -> (Pattern.compile(Password).matcher(str).matches());
}
