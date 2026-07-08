public class FibonacciRecursionCorrect {
  
  public static void printFibo(int a , int b , int n){
    if(n == 0){
      return;
    }
    int sum = a + b;
    System.out.print(sum + " ");
    printFibo(b , sum , n-1);
  }

  public static void main(String[] args) {
      
    int a = 0 ; 
    int b = 1;
    int n =10;
    System.out.print(a + " " + b +  " ");
    printFibo(a , b , n-2);
  }
}
