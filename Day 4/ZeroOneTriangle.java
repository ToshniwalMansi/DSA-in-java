public class ZeroOneTriangle {
  public static void main(String[] args) {
   /*  
   MY METHOD
   int n=5 ;
      for(int i = 1 ; i<=n ; i++){
        for(int j=1 ; j<=i ; j++){
          if(i%2==0 && j%2==0){
            System.out.print("1" + " ");
          }
          else if(i%2==0 && j%2!=0){
            System.out.print("0" + " ");
          }
          else if(i%2!=0 && j%2==0){
            System.out.print("0" + " ");
          }
          else{
            System.out.print("1" + " ");
          }
        }
        System.out.println("");
      }
         */

      //MORE EASIER WAY 

      int n=5 ; 
      for(int i=1 ; i<=n ; i++){
        for(int j=1 ; j<=i ; j++){
          if((i+j)%2==0){
            System.out.print("1 ");
          }
          if((i+j)%2!=0){
            System.out.print("0 ");
          }
        }
        System.out.println(" ");
      }
  }
}
