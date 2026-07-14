// Redoing all recurrsion sums because recusrion feels confusing 

public class PrintFiveToOne {
  
  public static void printNums(int i){

    if(i==0){
      return;
    }
    System.out.println(i);
    printNums(i-1);
  }

  public static void main(String[] args) {
      int i = 5;
      printNums(i);
  }
}
