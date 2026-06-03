//Write a function which takes in 2 numbers and returns the greater of those two .


import java.util.*;
public class GreaterOfTwoFunction {
  
  public static void greaterOfTwo(int a , int b){
    if(a>b){
      System.out.println("The greater of two numbers is : " + a);
    }
    else if(a<b){
      System.out.println("The greater of two numbers is : " + b);
    }
    return;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the 1st number : ");
      int a = sc.nextInt();

      System.out.print("Enter the 2nd number : ");
      int b = sc.nextInt();

      sc.close();

      greaterOfTwo(a,b);
  }
}
