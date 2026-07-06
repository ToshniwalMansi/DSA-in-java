import java.util.*;
public class BubbleSort {
  
  public static void printArray(int arr[]){
    for(int i=0 ; i<arr.length ; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println("");
  }

  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of numbers : ");
    int length = sc.nextInt();

    System.out.println("Enter the numbers : ");
    int[] arr = new int[length];

    for(int i=0 ; i<length ; i++){
      arr[i] = sc.nextInt();
    }

    System.out.println("Your original array is : ");
    printArray(arr);

    for(int i=0 ; i<arr.length-1 ; i++){
      for(int j=0 ; j<arr.length-i-1 ; j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

    System.out.println("You sorted array (by bubble sort is : ");
    printArray(arr);
  }
}
