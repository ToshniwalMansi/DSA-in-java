import java.util.*;
public class TwoDArray {
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    int numbers[][] = new int[3][5];

    for(int i=0 ; i<3 ; i++){
      for(int j=0 ; j<5 ; j++){
        numbers[i][j] = sc.nextInt();
      }
    }

    for(int i=0 ; i<3 ; i++){
      for(int j=0 ; j<5 ; j++){
        System.out.print(numbers[i][j]);
        System.out.print(" ");
      }
      System.out.println("");
    }
  }
}


// here the number of rows and columns are pre defined and only take input of array and prints them
