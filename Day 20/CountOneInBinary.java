Write a program to count the number of 1’s in a binary representation of the number.

import java.util.*;
public class CountOneInBinary {
  public static void main(String[] args) {
    
    
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. : ");
    int number = sc.nextInt();

    int counter = 0;
    for(int i=0 ; i<32 ; i++){
      int bitMask = 1<<i;
      int answer = bitMask & number ;
      
      if(answer != 0){
        
      }
    }

    System.out.println("The total one in number is : " + counter);

    // this code does not works for negative number 
    
    /* 

    this part is wrong
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. : ");
    int number = sc.nextInt();

    int counter = 0;

    for(int i=0 ; i<32 ; i++){
      if((number & 1) == 1){
        counter++;
      }
      number = number>>>1;
    }
    System.out.println("Total ones are : " + counter);
    */
  }
}
