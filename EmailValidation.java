import java.util.regex.Pattern;

public class EmailValidation {

    static String regex ="^[a-zA-Z0-9]+(([.+-][a-z0-9]{1,})?)+@(?:[a-zA-Z0-9])+.[a-zA-Z]{2,4}+((.[a-z]{2,4})?)$";
        public static boolean validateEmail(String Email) {
        Pattern pattern = Pattern.compile(regex);
        boolean res = pattern.matcher(Email).matches();
        return res;
    }
}
