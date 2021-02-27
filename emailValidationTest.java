import org.junit.*;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class emailValidationTest {

    public String Emails;
    public boolean expectedResult;

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100", false},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com",false},
                {"abc123@.com.com",false},
                {".abc@abc.com ",false}
        });
    }

    @Test
    public void EmailValidation_shouldReturnTrue() {
        boolean result = EmailValidation.validateEmail(Emails);
        Assert.assertEquals(expectedResult, result);
    }
}
