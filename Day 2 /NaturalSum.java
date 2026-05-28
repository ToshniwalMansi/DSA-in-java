/*print the sum of n natural number*/
import java.util.*;
public class NaturalSum {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of natural numbers : ");
      int n = sc.nextInt();

      int result = 0;
      for(int i = 1 ; i <= n ; i++){
        result = result + i ;
      }

      System.out.println("The sum of " + n + " numbers is " + result);

  }
}
