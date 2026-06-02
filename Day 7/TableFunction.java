import java.util.* ;
public class TableFunction {
  
  public static void printTable(int a){
    int result =1 ;
    for(int i=1 ; i<=10 ; i++){
      result = a*i;
      System.err.println(a + " * " + i + " = " + result);
    }
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number : ");
      int a = sc.nextInt();
      
      sc.close();

      printTable(a);
    }
}
