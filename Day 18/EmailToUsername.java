/*Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123”
  */

  
  
import java.util.*;

public class EmailToUsername{

  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your mail id : ");
    String Username = sc.next();

    System.out.println("--- Your Username is ---");

    for(int i=0 ; i<Username.length() ; i++){
      if(Username.charAt(i) == '@'){
        break;
      }
      System.out.print(Username.charAt(i));
    }
  }
}
