import java.util.*;
public class PrintArray{
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of array : ");
    int size = sc.nextInt();
    
    int[] numbers = new int[size];

    System.out.println("Enter the numbers : ");
    for(int i=0 ; i<size ; i++){
      numbers[i] = sc.nextInt();
    }

    System.out.println("---------------");
    System.out.println("This is your array : ");
   
    for(int i=0 ; i<size ; i++){
      System.out.println(numbers[i]);
    }

  }
}
