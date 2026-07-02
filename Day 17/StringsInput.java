import java.util.*;

public class StringsInput {
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter your name : ");
    String name = sc.next();
    sc.nextLine();

    System.out.println("My name is : " + name);
    //Here the output will only be the first name without spaces

    System.out.println("Enter your name : ");
    String fullName = sc.nextLine();

    System.out.println("My name is : " + fullName);
    //Here the full input will be the  output 
  }
}
