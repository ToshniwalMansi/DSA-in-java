import java.util.*;

public class FactorialRecursion {
  
  public static void printFactorial(int n , int factorial){

    if(n == 0){
      System.out.println("the factorial of is : " + factorial);
      return;
    }
    factorial *= n;
    printFactorial(n-1 , factorial );

  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the number to find factorial : ");
      int n = sc.nextInt();

      printFactorial(n , 1);
  }
}
