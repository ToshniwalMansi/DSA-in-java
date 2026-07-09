public class XPowerNWithRecursion {
  
  public static int printX(int x , int n ){
    
    if(n == 0){  //basw case 1
      return 1;
    }

    if(x == 0){  //base case 2
      return 0;
    }
    int xPownm1 = printX(x , n-1);
    int xPown = x * xPownm1 ;
    return xPown ;
  }

  public static void main(String[] args) {
      int answer = printX(2,10);
      System.out.println(answer);
  }
}
