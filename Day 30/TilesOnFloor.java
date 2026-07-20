public class TilesOnFloor {
  
  public static int placeTiles (int n , int m){
    if(n==m){
      return 2;
    }
    if(n<m){
      return 1;
    }

    // vertically
    int vertPlacements = placeTiles(n-m , m);

    // horizontally
    int horPlacement = placeTiles(n-1 , m);

    return vertPlacements + horPlacement ;
  }

  public static void main(String[] args) {
      
    int n = 4 , m = 2;
    int total = placeTiles(n,m);
    System.out.println(total);
  }
}
