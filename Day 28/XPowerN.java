/*
public class XPowerN {
  

  public static int printpower(int x , int n ){

    if(n==0){
      return 1;
    }
    return x* printpower(x, n-1);
  }

  public static void main(String[] args) {
    int n = 10;
    int x = 2;
    int power =  printpower(x, n);
    System.out.println(x + " power " + n + " is :" + power);
  }
}

*/

//With log n complexity

public class XPowerN {

  public static int power(int x , int n){

    if( n == 0){
      return 1;
    }
    if(x == 0){
      return 0;
    }

    if(n%2==0){
      int half = power(x, n/2);
      return half*half;
    }
    else{
      int half = power(x, n/2);
      return x*half*half;
    }
  }

  public static void main(String[] args) {
      System.out.println(power(2, 10));
  }
}
