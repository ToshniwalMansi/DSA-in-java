import java.util.*;
public class TransposeOfMatrix {
  
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

    int[][] transpose = new int [column][rows];
    for(int i=0 ; i<rows ; i++){
      for(int j=0 ; j<column ; j++){
        transpose[j][i] = number[i][j];
      }
    }

    System.out.println("Your original matrix : ");
    for(int i=0 ; i<rows ; i++){
      for(int j=0 ; j<column ; j++){
        System.out.print(number[i][j] + " ");
      }
      System.out.println("");
    }

    System.out.println("The transpose matrix : ");
    for(int i=0 ; i<rows ; i++){
      for(int j=0 ; j<column ; j++){
        System.out.print(transpose[i][j] + " ");
      }
      System.out.println("");
    }
  }
}
