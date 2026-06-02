import java.util.*;
public class OddSumFunction {
  
  public static void oddSum(int a){
    int sum = 0;
    for(int i=1 ; i<=a ; i=i+2){
      sum = sum + i;
    }
    System.out.println("The sum of odd numbers from 1 to " + a + " is : " + sum);
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number till the sum of odd numbbers you want : ");
      int a = sc.nextInt();

      sc.close();

      oddSum(a);
  }
}
