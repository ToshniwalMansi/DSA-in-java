import java.util.*;
public class FindInTwoDArray {
  
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of rows : ");
    int rows = sc.nextInt();

    System.out.print("Enter number of columns : ");
    int columns = sc.nextInt();

    int[][] numbers = new int[rows][columns];

    for(int i=0 ; i<rows ; i++){
      for(int j=0 ; j<columns ; j++){
        numbers[i][j] = sc.nextInt();
      }
    }

    System.out.print("Enter the element you want to find : ");
    int x = sc.nextInt();
    int count = 0;

    for(int i=0 ; i<rows ; i++){
      for(int j=0 ; j<columns ; j++){
        if(numbers[i][j] == x){
          System.out.println("Number " + x + " is found at index [" + i + "]["+ j + "]");
          count++;
        }
        
      }
    }
    if(count ==0 ){
      System.out.println("!!! The number does not exist in array !!!");
    }
  }
}


//here a 2D array is taken as input and then a number is taken input and found in the array
