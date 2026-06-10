import java.util.*;
public class TimeThree {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();

      for(int i=0 ; i<n ; i++){
        for(int j=0 ; j<m ; j++){
          System.out.println("hello");
        }
      }
  }
}



// outer loop runs n time 
// inner loop is m time 
// time compexity is m*n
// it will be multiplied because it is nested loop
