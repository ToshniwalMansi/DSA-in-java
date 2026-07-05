// Write a program to find if a number is a power of 2 or not.

import java.util.*;
public class PowerOfTwoOrNot {
  public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    if( (number & (number-1)) == 0 && number > 0){
      System.out.println("yes");
    } 
    else{
      System.out.println("no");
    }

    
  }
}


// a number is a pwoer of two if its positive and has exactly one bit set
