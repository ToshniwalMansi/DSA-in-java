//Enter 3 numbers from the user and make a function to print their average 

import java.util.*;
public class AverageFunction {
  
  public static void average(int a , int b , int c){
    int average = (a+b+c)/3;
    System.out.println("The average of three numbers is : " + average);
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter 1st number : ");
      int a = sc.nextInt();

      System.out.print("Enter 2nd number : ");
      int b = sc.nextInt();

      System.out.print("Enter 3nd number : ");
      int c = sc.nextInt();

      sc.close();

      average(a,b,c);

  }
}
