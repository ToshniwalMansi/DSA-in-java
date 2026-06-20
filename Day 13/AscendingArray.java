import java.util.*;
public class AscendingArray {
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter size of array : ");
      int size = sc.nextInt();

      int numbers[] = new int[size];
      for(int i=0 ; i<size ; i++){
        numbers[i] = sc.nextInt();
      }

      boolean isAscending = true;

      for(int i=0 ; i<size-1 ; i++){

        if(numbers[i] > numbers[i+1]){
          isAscending = false;
        }
      }

      if(isAscending){
        System.out.println("The array is in ascending order");
      }
      else{
        System.out.println("The array is not in ascending order");
      }

      sc.close();
  }
}
