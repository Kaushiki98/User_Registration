import org.junit.*;

public class UserRegistrationTest {

    UserValidation userRegistration = new UserValidation();
        @Test
        public void FirstNameHappy(){
        boolean result=userRegistration.firstNameValidation("Kaushiki");
        Assert.assertTrue(result);
    }
        @Test
        public void FirstNameSad(){
        boolean result=userRegistration.firstNameValidation("kauhiki");
        Assert.assertFalse(result);
    }
        @Test
        public void LastNameHappy(){
        boolean result=userRegistration.lastNameValidation("Arasavilli");
        Assert.assertTrue(result);
    }
        @Test
        public void LastNameSad(){
        boolean result=userRegistration.lastNameValidation("arasavilli");
        Assert.assertFalse(result);
    }
        @Test
        public void EmailHappy(){
        boolean result=userRegistration.emailValidation("kaushiki@gmail.com");
        Assert.assertTrue(result);
    }
        @Test
        public void EmailSad(){
        boolean result=userRegistration.emailValidation("kaushiki.01gmail.com");
        Assert.assertFalse(result);
    }
        @Test
        public void MobileHappy(){
        boolean result=userRegistration.mobileValidation("91 9981234456");
        Assert.assertTrue(result);
    }
        @Test
        public void MobileSad(){
        boolean result=userRegistration.mobileValidation("8975891291");
        Assert.assertFalse(result);
    }
        @Test
        public void PasswordHappy(){
        boolean result=userRegistration.passwordValidationRule("Abcdbd#34");
        Assert.assertTrue(result);
    }
        @Test
        public void PasswordSad(){
        boolean result=userRegistration.passwordValidationRule("abcders");
        Assert.assertFalse(result);
    }
}
