import java.util.*;
public class PrintArrayNames {
  
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    
    System.out.print("Enter the number of names you want to input : ");
    int size = sc.nextInt();

    String names[] = new String[size];

    System.out.println("Enter the names : ");
    for(int i=0 ; i<size ; i++){
      names[i] = sc.next();
    }

    System.out.println("Your names are : ");
    for(int i=0 ; i<size ; i++){
      System.out.println("Name at " + (i+1) + " is " + names[i]);
    }

  }
}


// this code takes names as inout in array and prints them
