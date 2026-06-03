//Write a function that calculates the GCD of two number 

import java.util.*;
public class GCDFinder {
  
  public static void greatestCommonDivisor(int a , int b){
    
    int startingPoint = 0;

    if(a<b){
      startingPoint = a;
    }
    else if(a>=b){
      startingPoint = b;
    }

    for(int i=startingPoint ; i>=1 ; i--){
     int A = a%i;
     int B = b%i;

     if(A==0 && B==0){
      System.out.println("The GCD of both numbers is : " + i);
      break;
     }

    }
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter 1st number : ");
      int a = sc.nextInt();

      System.out.print("Enter 2nd number : ");
      int b = sc.nextInt();

      greatestCommonDivisor(a,b);
      sc.close();
  }
}
