import java.util.*;
public class ArrayInput {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int[] marks = new int[n];

      for(int i=0 ; i<n ; i++){
        marks[i] = sc.nextInt();
      }

      for(int i=0 ; i<n ; i++){
        System.out.println(marks[i]);
      }


  }
}


// here you can give inout to the arrays as well
//here in this code we take array as input 
