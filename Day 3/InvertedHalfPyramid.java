public class InvertedHalfPyramid {
  public static void main(String[] args) {


    
      /*
      MY METHOD
      int n = 4;
      int m = 4;
      for(int i=1 ; i<=n ; i++){
        for(int j=1; j<=m ; j++){
          System.out.print("*");
        }
        System.out.println("");
        m--;
      }*/


    //EASIER WAY
    int n=4;
    for(int i= n ; i>=1 ; i--){
      for(int j=1 ; j<=i ; j++){
        System.out.print("*");
      }
      System.out.println("");
    }


  }
}
