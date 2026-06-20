import java.util.*;
public class MinMaxWithoutMINMAX {
  
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of array : ");
    int size = sc.nextInt();

    int[] numbers = new int[size];

    System.out.println("Enter the numbers : ");
    for(int i=0 ; i<size ; i++){
      numbers[i] = sc.nextInt();
    }

    int min = numbers[0];
    int max = numbers[0];

    for(int i=0 ; i<size ; i++){
      if(min > numbers[i]){
        min = numbers[i];
      }
      if(max < numbers[i]){
        max = numbers[i];
      }
    }

    System.out.println("The maximum value from array is : " + max);
    System.out.println("The minimum value from array is : " + min);
  }
}
