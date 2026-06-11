import java.util.*;
public class ArraysInput {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int[] marks = new int[n];

      for(int i=0 ; i<n ; i++){
        System.out.println(marks[i]);
      }


  }
}



// here as you dont give inputs yet the values output comes 0 because java initiializes value to zero
