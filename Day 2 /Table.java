/*Print the table of a number  input by user*/
import java.util.*;
public class Table {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number : ");
      int n = sc.nextInt();

      System.out.println("The table of n : " + n);
      
      for(int i = 1 ; i <= 10 ; i++){
        int result = 1;
        result = i * n ;
        System.out.println(n + " * " + i + " = " + result );
      }
  }
}
