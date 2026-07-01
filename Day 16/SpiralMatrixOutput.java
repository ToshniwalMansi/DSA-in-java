import java.util.*;

public class SpiralMatrixOutput {
  public static void main(String[] args) {
      
    Scanner sc = new Scanner (System.in);

    System.out.print("Enter no. of rows : ");
    int rows = sc.nextInt();

    System.out.print("Enter no. of columns : ");
    int cols = sc.nextInt();

    int[][] numbers = new int[rows][cols];

    System.out.println("Enter numbers for your matrix : ");
    for(int i=0 ; i<rows ; i++){
      for(int j=0 ; j<cols ; j++){
        numbers[i][j] = sc.nextInt();
      }
    }

    System.out.println("Your matrix is : ");
    for(int i=0 ; i<rows ; i++){
      for(int j=0 ; j<cols ; j++){
        System.out.print(numbers[i][j]);
        System.out.print(" ");
        
      }
      System.out.println("");
    }


    int top = 0;
    int bottom = rows-1 ; 
    int left = 0 ;
    int right = cols-1 ;

    System.out.println("your order of spiral matrix is : ");

 

    while(top<=bottom && left<=right){
      for(int i=left ; i<=right ; i++){
        System.out.print(numbers[top][i] + " ");
      }
      top++;

      for(int i=top ; i<=bottom ; i++){
        System.out.print(numbers[i][right] + " ");
      }
      right--;

      if(top<= bottom){
        for(int i=right ; i>=left ; i--){
        System.out.print
        (numbers[bottom][i] + " ");
      }
      bottom--;
      }
     
      if(left<=right){
        for(int i=bottom ; i>=top ; i--){
      System.out.print(numbers[i][left] + " ");
    }
    left++;
  }
}


  }
}


//This code takes a matrix as input and gives output of the matriix while going spirally inside 
