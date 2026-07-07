import java.util.*;
public class InsertionSort {

  public static void printArray(int arr[]){
    for(int i=0 ; i<arr.length ; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println("");
  }
  
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length of array : ");
    int length = sc.nextInt();

    int numbers[] = new int[length];

    System.out.println("Enter the numbers : ");
    for(int i=0 ; i<numbers.length ; i++){
      System.out.print(i+1 + ". ");
      numbers[i] = sc.nextInt();
    }

    System.out.println("Your original array was : ");
    printArray(numbers);

    //sorting
    for(int i=1 ; i<numbers.length ; i++){
      int current = numbers[i];
      int j = i-1;
      while( j>=0 && current < numbers[j]){
        numbers[j+1] = numbers[j];
        j--;
      }
      numbers[j+1] = current;
    }

    System.out.println("The sorted array is : ");
    printArray(numbers);
    
  }
}
