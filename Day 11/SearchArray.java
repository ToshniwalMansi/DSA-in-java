// take an array as input from user . Search for a given number x and print at which index it occcurs 

import java.util.*;
public class SearchInArray {
  
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements you want to input : ");
    int n = sc.nextInt();

    int[] numbers = new int[n];

    System.out.println("Enter the numbers : ");
    for(int i=0 ; i<n ; i++){
     
      numbers[i] = sc.nextInt();
    }
    
    System.out.print("Enter the number you want to find : ");
    int m = sc.nextInt();

    for(int i=0 ; i<n ; i++){
      if(numbers[i] == m){
        System.out.println("The number you want to find is at " + i + " postion ");
        break ;
      }

    }
    sc.close();
  }
}
