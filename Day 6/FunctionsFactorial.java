import java.util.*;
public class FunctionFactorial {
  
  /* 
  public static void factorial(int a){
    
    if(a>0){
      int result =1;
     for(int i = a ; i>= 1 ; i--){
      result = result*i;
      }
      System.out.println("The factorial is : " + result);
    }
    else if(a==0){
      
      System.out.println("the factorial is : " + 1);
    }
    else if(a<0){
      System.out.println("factorial cant be found for this number ");
    }
    
  } 
  */

  public static void factorial(int a){
    
    if(a>=0){
      int result =1;
     for(int i = a ; i>= 1 ; i--){
      result = result*i;
      }
      System.out.println("The factorial is : " + result);
    }
    
    else {
      System.out.println("factorial cant be found for this number ");
    }
    
  }

  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int a = sc.nextInt();

    factorial(a);
  }
}
