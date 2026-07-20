public class PathInAMaze {
  
  public static int countPaths(int i , int j , int m , int n){
    if(i == n || j==m){
      return 0;
    }

    if(i == n-1 && j == m-1){
      return 1 ;
    }

    int downPaths = countPaths(i+1 , j , m , n);

    int rightPaths = countPaths(i , j+1 , m , n) ;

    return downPaths + rightPaths ;
  }

  public static void main(String[] args) {
      int n=3 , m=3;
      int totalPaths = countPaths(0,0,m,n);
      System.out.println(totalPaths);
  }
}
