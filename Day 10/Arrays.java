import java.util.*;
public class Arrays {
  public static void main(String[] args) {
      int[] marks = new int[3];
      marks[0] = 99;
      marks[1] = 89;
      marks[2] = 90;

      System.out.println(marks[0]);
      System.out.println(marks[1]);
      System.out.println(marks[2]);


    // we can also print all those in loop
    for(int i=0 ; i<3 ; i++){
      System.out.println(marks[i]);
    }
  }
}
