//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.*;
public class NegativeZeroPositive{


  public static int positive = 0, negative = 0, zero = 0;


  public static void negativePositiveZero(int a){
   
    if(a>0){
      positive ++ ;
    }
    else if(a<0){
      negative ++;
    }
    else if(a==0){
      zero ++;
   }
   else{
    System.out.println("Invalid Input");
   }
  }

  public static void display(){
    System.out.println("Total positive numbers are : " + positive);
    System.out.println("Total negative numbers are : " + negative);
    System.out.println("Total zero numbers are : " + zero);
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x = 1;
    do { 
        System.out.print("Enter the number : ");
        int b = sc.nextInt();
        negativePositiveZero(b);
        System.out.print("Do you want to continue ? (Enter 1 for yes 0 for no ) : ");
       x = sc.nextInt();

    } while (x==1);


     display();

  }
}
