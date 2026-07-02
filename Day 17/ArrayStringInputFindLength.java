//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.


import java.util.*;
public class ArrayStringInputFindLength {
  
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your length of array : ");
    int length = sc.nextInt();

    String[] names = new String[length];

    System.out.println("Enter the names : ");
    for(int i=0 ; i<length ; i++){
      names[i] = sc.next();
    }

    int count = 0 ;
    for(int i=0 ; i<length ; i++){
      count = count + names[i].length();
    }

    System.out.println("The total length of the names is : " + count);
  }
}
