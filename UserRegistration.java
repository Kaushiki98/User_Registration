import java.io.*;
import java.util.*;
import java.util.regex.*;

public class UserRegistration{

	public static void firstName(){
		Scanner Obj = new Scanner(System.in);
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
	public static void main(String[] args){
		UserRegistration user = new UserRegistration();
		user.firstName();
 	}
}

