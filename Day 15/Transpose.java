import java.util.*;
public class Transpose {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter number of rows : ");
    int rows = sc.nextInt();

    System.out.print("Enter number of columns : ");
    int column = sc.nextInt();

    int[][] number = new int[rows][column];

    System.out.println("Enter the numbers : ");
    for(int i=0 ; i<rows ; i++){
      for(int j=0 ; j<column ; j++){
        number[i][j] = sc.nextInt();
      }
    }

    System.out.println("Your matirx ");
    for(int i=0 ; i<rows ; i++){
      for(int j=0 ; j<column ; j++){
        System.out.print(number[i][j] + " ");
      }
      System.out.println("");
    }

    System.out.println("This is your transpose matrix : ");
    for(int i=0 ; i<column ; i++){
      for(int j=0 ; j<rows ; j++){
        System.out.print(number[j][i] + " ");
      }
      System.out.println("");
    }
  }
}


//This code makes the transpose of the array input by the user and prints the transpose without making a new array 
