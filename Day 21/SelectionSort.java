import java.util.*;
public class SelectionSort {
  
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

    int[] arr = new int[length];

    System.out.println("Enter elements : ");
    for(int i=0 ; i<arr.length ; i++){
      System.out.print((i+1) + ".");
      arr[i] = sc.nextInt();
      
    }

    System.out.println("Your original array was : ");
    printArray(arr);

    for(int i=0 ; i<arr.length-1 ; i++){
      int smallest = i;
      for(int j = i+1 ; j<arr.length ; j++){
        if(arr[smallest] > arr[j]){
          smallest = j;
        }
      }
      int temp = arr[smallest];
      arr[smallest] = arr[i];
      arr[i] = temp; 
    }

    System.out.println("your selection sorted array is : ");
    printArray(arr);
    
  }

  
}
