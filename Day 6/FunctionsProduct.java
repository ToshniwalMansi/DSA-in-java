import java.util.*;
public class FunctionsProduct {
  
  public static int product(int a , int b){
    int result = a*b;
    return result;
  }

  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st number : ");
    int a = sc.nextInt();

    System.out.print("Enter 2nd number : ");
    int b = sc.nextInt();

    int result = product(a,b);
    System.out.println("The product od two numbers is : " + result);
  }
}
