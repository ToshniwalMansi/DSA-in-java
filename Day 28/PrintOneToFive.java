public class PrintOneToFive {
  
  public static void printNums(int i , int n){

    if( i == n+1){
      return;
    }

    System.out.println(i);
    printNums(i+1 , n);
  }

  public static void main(String[] args) {
      int n = 5;
      printNums(1, n);
  }
}
