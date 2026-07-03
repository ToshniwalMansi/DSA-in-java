import java.util.*;
public class ReverseAString {
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the String you want to reverse : ");
      String name = sc.next();

      System.out.println("Your reversed String is : ");
      for(int i=name.length()-1 ; i>=0 ; i--){
        System.out.print(name.charAt(i));
      }
      
  }
}
