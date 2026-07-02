import java.util.*;
public class StringLength {
  
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first name : ");
    String firstName = sc.next();

    System.out.print("Enter last name : ");
    String lastName = sc.next();

    String fullName = firstName +" "+ lastName ;

    System.out.println("Your full name is : " + fullName);

    System.out.println("Length of your name is : " + fullName.length());

    for(int i=0 ; i<fullName.length() ; i++){
      System.out.println(fullName.charAt(i));
    }
    //here the letter is given as an output for the number of index
  }
}
