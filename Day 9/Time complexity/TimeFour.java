import java.util.*;
public class TimeFour {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int m = sc.nextInt();

      for(int i=0 ; i<n ; i++){
        System.out.println("hello");
      }

      for(int j=0 ; j<m ; j++){
        System.out.println("hello");
      }
  }
}


// loop 1 runs n times 
// loop 2 runs m times 
// loop is not nested so time complexity will be m+n
