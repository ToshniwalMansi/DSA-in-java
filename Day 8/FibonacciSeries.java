//Write a program to print Fiibonacci series of n terms where n is input by user 
// 0 1 1 2 3 5 8 13 21 ................
//In the fibonacci series , a number is the sum of the previous 2 numbers that came before it 

import java.util.*;
public class FibonaccciSeries {
  
  public static void fibonacci(int a){
    int b = 0;
    int c = 1;
    
    for(int i=0 ; i<=a ; i++){
     
      System.out.print(b + " ");

      int next = c+b;
      b = c;
      c = next;
      
      
    }
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number till you want the series : ");
      int a = sc.nextInt();

      sc.close();
      fibonacci(a);
  }
}
