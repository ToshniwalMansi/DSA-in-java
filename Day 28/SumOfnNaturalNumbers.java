//Print sum of n natural numbers

public class SumOfnNaturalNumbers {
  
  public static int sum(int i , int n , int sum){

    if(i > n){
      return sum;
    }
    sum = sum + i;
    
    return sum(i+1, n, sum);
  }

  public static void main(String[] args) {
      int ans = sum(0, 10, 0);
      System.out.println("The sum is : " + ans);

  }
}
