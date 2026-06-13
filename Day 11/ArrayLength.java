import java.util.*;
public class ArrayLength {
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the number of elements : ");
      int size = sc.nextInt();

      int[] numbers = new int[size];

      System.out.println("Enter the numbers : ");
      for(int i=0 ; i<size; i++){
        numbers[i] = sc.nextInt();
      }

      System.out.println("The size of the array is : " + numbers.length);
  }
}
