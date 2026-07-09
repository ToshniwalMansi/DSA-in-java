//Print X power N with stack heigth log n


public class XPowerNRecursionLogN {
  
  public static int printXPowerN(int n , int x){

    if(n==0){
      return 1;
    }
    if(x == 0){
      return 0;
    }

    if( n % 2 == 0){
      return printXPowerN(n/2 , x) * printXPowerN(n/2 , x);
    }
    else{
      return printXPowerN(n/2 , x) * printXPowerN(n/2 , x) * x;
    }
  }

  public static void main(String[] args) {
      
    int x = 2;
    int n = 10;
    int answer = printXPowerN(n,x);
    System.out.println(answer);
  }
}
