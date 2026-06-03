import java.util.*;
public class PowerFunction {

  public static void power(int x , int n){
    int result = 1;
    for(int i = 1 ; i<=n ; i++){
      result = result*x;
    }
    System.out.println("The value of " + x + "power " + n + " is : " + result);
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the base number : ");
      int x = sc.nextInt();

      System.out.print("Enter the power value : ");
      int n = sc.nextInt();

      power(x,n);
      sc.close();
  }
}
