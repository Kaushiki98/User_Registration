import org.junit.*;

public class UserRegistrationTest {

    UserValidation userRegistration = new UserValidation();
        @Test
        public void FirstNameHappy(){
        boolean result = true;
        try {
            result = userRegistration.firstNameValidation("Kaushiki");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }
        @Test
        public void FirstNameSad(){
        boolean result=false ;
        try {
            result = userRegistration.firstNameValidation("kauhiki");
        }catch (Exception e){
            e.printStackTrace();
        }
        Assert.assertFalse(result);
    }
        @Test
        public void LastNameHappy(){
        boolean result=true;
        try{
            result = userRegistration.lastNameValidation("Arasavilli");
        }catch(Exception e ){
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }
        @Test
        public void LastNameSad(){
        boolean result=true;
        try {
            result = userRegistration.lastNameValidation("arasavilli");
        }catch(Exception e){
            e.printStackTrace();
        }
        Assert.assertFalse(result);
    }
        @Test
        public void EmailHappy(){
        boolean result=true;
        try{
            result = userRegistration.emailValidation("kaushiki@gmail.com");
        }catch (Exception e){
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }
        @Test
        public void EmailSad(){
        boolean result=false;
        try {
            result = userRegistration.emailValidation("kaushiki.01gmail.com");
        }catch (Exception e){
            e.printStackTrace();
        }
        Assert.assertFalse(result);
    }
        @Test
        public void MobileHappy(){
        boolean result=true;
        try {
            result = userRegistration.mobileValidation("91 9981234456");
        }catch (Exception e){
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }
        @Test
        public void MobileSad(){
        boolean result=false;
        try {
            result = userRegistration.mobileValidation("8975891291");
        }catch (Exception e){
            e.printStackTrace();
        }
        Assert.assertFalse(result);
    }
        @Test
        public void PasswordHappy(){
        boolean result=true;
        try {
            result = userRegistration.passwordValidationRule("Abcdbd#34");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }
        @Test
        public void PasswordSad(){
        boolean result=false ;
        try {
            result = userRegistration.passwordValidationRule("abcders");
        }catch (Exception e){
            e.printStackTrace();
        }
        Assert.assertFalse(result);
    }

}

