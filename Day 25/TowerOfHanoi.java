public class TowerOfHanoi {
  
  public static void towerOfHanoi(int n , String src , String helper , String dest){

    if(n==1){
      System.out.println("Transferred disk " + n + " to " + dest + " from " + src);
      return ;
    }

    towerOfHanoi(n-1, src, dest, helper);
    System.out.println("Transferred disk " + n + " to " + dest + " from " + src);
    towerOfHanoi(n-1, helper, src, dest);
  }

  public static void main(String[] args) {
      
    int n = 1;
    towerOfHanoi(n, "S", "H", "D");
  }
}
