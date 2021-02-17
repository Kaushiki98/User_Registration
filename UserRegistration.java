import java.io.*;
import java.util.*;
import java.util.regex.*;

public class UserRegistration{

	static Scanner Obj = new Scanner(System.in);

	// Checking the validation of First name
	public static void firstNameValidation(){

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
         if ( found == true ) {
            System.out.println("First name is valid");
         }
         else {
            System.out.println("Not valid first name should starts with Cap and has minimum 3 character ");
	       }
   }

	// Checking the validation of last name
	 public static void lastNameValidation(){

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
         if ( found == true ) {
            System.out.println("Last name is valid");
         }
         else {
            System.out.println("Not valid first name should starts with Cap and has minimum 3 character ");
          }
   }

	//Cheking the Validation of Email
	public static void emailValidation() {

		System.out.println("Enter your email id: ");
		String name = Obj.nextLine();

		String regex = "[a-z]+[.]+[a-z]+[@]+[a-z]{1,5}+[.]+[a-z]{1,3}$";

		// Creating a pattern object
		Pattern pattern = Pattern.compile(regex);

		// Creating a Matcher object
		Matcher matcher = pattern.matcher(name);

		// Verifying whether given phone number is valid
		boolean result = matcher.matches();
		if (result == true) {
			System.out.println(" Email is valid");
		} else {
			System.out.println("Not valid");
			System.out.println("Email id should be in Eg,: abc.def123@gmail.com ");
		}
	}

   public static void main(String[] args){

		UserRegistration User = new UserRegistration();
      User.firstNameValidation();
		User.lastNameValidation();
		User.emailValidation();
 	}
}

