//Write a function to check if a number is even or not 


import java.util.*;
public class EvenOrNotFunctions {
  public static void evenOrOdd(int a){
    if(a%2 == 0){
      System.out.println("The number is even ");
    }
    else{
      System.out.println("The number id odd ");
    }
    
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number : ");
      int a = sc.nextInt();

      sc.close();

      evenOrOdd(a);
  }
}
