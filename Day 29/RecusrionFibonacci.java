public class RecusrionFibonacci {
  
  public static void print(int num1 , int num2  , int n){

    
    if(n==0){
      return;
    }
    
    
    int sum = num1 + num2;
    num1 = num2;
    num2 = sum;
    System.out.print(sum + " ");
    print(num1, num2,  n-1);
  }

  public static void main(String[] args) {
    System.out.print("0 1 ");
    int n = 10;
      print(0, 1,  n-2);
  }
}
