// Write an infinite loop using do while condition 

import java.util.*;
public class InfiniteDoWhileLoop {
  

  public static void infinteLoop(int a){
    do{
      System.out.println("This is loop ");
      a--;
    }
    while(a!=a+1);
    return ;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Give a number : ");
      int a = sc.nextInt();

      sc.close();

      infinteLoop(a);
  }
}
