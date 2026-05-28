/* Qs. Print if a number is prime or not (Input n from the user). 
[In this problem you will learn how to check if a number is prime or not]
*/

import java.util.*;
public class PrimeOrNot {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number : ");
      int n = sc.nextInt();
      int result = 0;

      for(int i = 2 ; i <= n/2 ; i++){
        if(n%i==0){
          result ++;

        }
      }
      if(result==0){
        System.out.println("The number is prime");
      }else{
        System.out.println("The number is not prime");
      }
      
  }
}
