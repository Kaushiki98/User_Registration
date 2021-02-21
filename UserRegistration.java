import java.io.*;
import java.util.*;
import java.util.regex.*;

public class UserRegistration
{
	static Scanner Obj = new Scanner(System.in);

	// Checking the validation of First name
	public static void firstNameValidation()
	{
      System.out.println("Enter your First name: ");
      String name = Obj.nextLine();

      //Checking the entered name
      String regex = "^[A-Z][a-z]{2,}$" ;

      //Object pattern created
      Pattern pattern = Pattern.compile(regex);

      // Creating a Matcher object
      Matcher matcher = pattern.matcher(name);

		boolean found = matcher.matches();

         //checking if patter matched or not
         if ( found == true )
			{
            System.out.println("First name is valid");
         }
         else
			{
         	System.out.println("Not valid first name should starts with Cap and has minimum 3 character ");
	      }
   }

	// Checking the validation of last name
	public static void lastNameValidation()
	{
      System.out.println("Enter your Last name: ");
      String name = Obj.nextLine();

      //Checking the entered name
      String regex = "^[A-Z][a-z]{2,}$" ;

      //Object pattern created
      Pattern pattern = Pattern.compile(regex);

      // Creating a Matcher object
      Matcher matcher = pattern.matcher(name);

      boolean found = matcher.matches();

         //checking if patter matched or not
         if ( found == true )
			{
            System.out.println("Last name is valid");
         }
         else
			{
            System.out.println("Not valid first name should starts with Cap and has minimum 3 character ");
         }
   }

	//Cheking the Validation of Email
	public static void emailValidation() 
	{
		System.out.println("Enter your email id: ");
		String name = Obj.nextLine();

		String regex = "[a-z]+[.]+[a-z]+[@]+[a-z]{1,5}+[.]+[a-z]{1,3}$";

		// Creating a pattern object
		Pattern pattern = Pattern.compile(regex);

		// Creating a Matcher object
		Matcher matcher = pattern.matcher(name);

		// Verifying whether given phone number is valid
		boolean result = matcher.matches();
		if (result == true)
		{
			System.out.println(" Email is valid");
		}
		else
		{
			System.out.println("Email id should be in Eg,: abc.def123@gmail.com ");
		}
	}

	//Checking for the valide mobile number
	public static void mobileValidation()
	{
		System.out.println("Enter your mobile number: ");
		String name = Obj.nextLine();

		String regex = "[91]+[ ]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]";

		//Creating a pattern object
		Pattern pattern = Pattern.compile(regex);

		// Creating a Matcher object
		Matcher matcher = pattern.matcher(name);

		// Verifying whether given phone number is valid
		boolean result = matcher.matches();
		if (result == true)
		{
			System.out.println("Mobile number is  valid");
		}
		else
		{
			System.out.println("Mobile number formate should be ex:91 1234567890 ");
		}
	}

	//Validating the password with minimum 8 characters
	public static void passwordValidationRule()
	{
		System.out.println("Enter your password : ");
		String name = Obj.nextLine();

		// Password characters should be 8 one Uppercase and atleast one number
		String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}";

		// Creating a pattern object
		Pattern pattern = Pattern.compile(regex);

		// Creating a Matcher object
		Matcher matcher = pattern.matcher(name);

		//Validation of number of Password characters
		boolean result = matcher.matches();
		if (result == true)
		{
			System.out.println("password is valid");
		}
		else
		{
			System.out.println("password should be ex: Abcdefgh$987 ");
		}
	}


   public static void main(String[] args)
	{
		UserRegistration User = new UserRegistration();
      User.firstNameValidation();
		User.lastNameValidation();
		User.emailValidation();
		User.mobileValidation();
		User.passwordValidationRule();
	}
}

