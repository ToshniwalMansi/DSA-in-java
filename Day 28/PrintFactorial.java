/*
public class PrintFactorial {
  
  public static int factorial(int n , int product){

    if(n==0){
      return product;
    }

    product = product*n;
    return factorial(n-1, product);
  }

  public static void main(String[] args) {
    int n = 10;
      int ans = factorial(n,1);
      System.out.println("The factorial of " + n + " is : "+ ans);
  }
}

*/

// Without using accumulator

public class PrintFactorial {

  public static int factorial(int n){

    if( n==0 || n==1){
      return 1;
    }

    return n*factorial(n-1);
  }

  public static void main(String[] args) {
      
    int n = 10;
    System.out.println(factorial(n));
  }
}
