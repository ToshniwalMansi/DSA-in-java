//Make a function to check if a given number is prime or not 


import java.util.*;
public class PrimeFunction {
  
  public static void primeOrNot(int a){
    int count = 0;
    for(int i = 1 ; i<=a/2 ; i++){
      if(a%i == 0){
        count++ ;
      }

    }
    if(count == 1){
      System.out.println("The number is a prime number ");
    }
    else{
      System.out.println("The number is not a prime number");
    }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = sc.nextInt();
        sc.close();

        primeOrNot(a);
        
    }
  }

