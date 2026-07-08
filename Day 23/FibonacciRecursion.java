// wrote this code by myself has several bugs 


import java.util.*;
public class FibonacciRecursion {
  
  public static int printSeries(int i , int a , int b , int n){

    if(i == n){
      return n;
    }
    
    

    int sum = a+b;
    
    System.out.print(a + " ");
    a = b;
    b = sum;
    printSeries(i+1 ,a , b , n );
    
   
    return sum;

  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number : ");
      int n = sc.nextInt();

      printSeries(0 , 0 ,1 , n);
  }
}
