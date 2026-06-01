import java.util.*;
public class FunctionsAdd {
  
  public static int sum(int a , int b){
    int sum = a+b;
    return sum;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 1st number : ");
      int a = sc.nextInt();

      System.out.println("Enter 2nd number : ");
      int b = sc.nextInt();

     sum(a,b);   //This is not printed 
      System.err.println("The sum of two numbers is : " + sum(a,b));

      //Another way

      int result = sum(a,b);
      System.out.println("The sum of both numbers are : " + result);
  }
}
