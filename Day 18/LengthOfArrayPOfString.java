import java.util.*;
public class LengthOfArrayPOfString {
  
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter total names : ");
    int length = sc.nextInt();

    String names[] = new String[length];
    int longs = 0 ;

    System.out.println("Enter the names : ");
    for(int i=0 ; i<length ; i++){
      System.out.print(i+1 + ".");
      names[i] = sc.next();
      StringBuilder sb = new StringBuilder(names[i]);
      longs = longs + sb.length();
    }

    System.out.println("The lenth of total letters is : " + longs);


    System.out.print("Enter total names : ");
    int again = sc.nextInt();

    String name[] = new String[length];
    StringBuilder all = new StringBuilder();

    System.out.println("Enter the names : ");
    for(int i=0 ; i<again ; i++){
      System.out.print(i+1 + ".");
      name[i] = sc.next();
      all.append(name[i]);
    }

    System.out.println("The lenth of total letters is : " + all.length());

  }
}
