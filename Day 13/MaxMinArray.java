import java.util.*;
public class MaxMinArray {
  
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    int size = sc.nextInt();

    int numbers[] = new int[size];
    
    System.out.println("Enter the numbers : ");
    

    for(int i=0 ; i<size ; i++){
      numbers[i] = sc.nextInt();
    }

    int max = Integer.MIN_VALUE ;
    int min = Integer.MAX_VALUE ;

    for(int i=0 ; i<size ; i++){
      if(numbers[i] < min){
        min = numbers[i];
      }
      else if(numbers[i] > max){
        max = numbers[i];
      }
    }

    System.out.println("The minimum value is : " + min);
    System.out.println("The maximum value is : " + max);
    
  }
}
