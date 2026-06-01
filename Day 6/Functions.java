import java.util.*;

public class Functions{

  public static void printMyName(String name){
    System.err.println("Your name is : " + name);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String name = sc.next();

    printMyName(name);
  }
}
