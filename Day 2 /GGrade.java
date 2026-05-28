/* Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
*/

import java.util.*;
public class Grade {
  public static void main(String[] args) {
      int n;
      Scanner sc = new Scanner(System.in);
        
        do { 
            
             System.out.print("Enter 1 to give input or 0 to stop : ");
             n = sc.nextInt();
        
            
            if(n==1){
              System.out.print("Enter the score : ");
              int marks = sc.nextInt();
               if(marks>=90){
                  System.out.println("This is Good");
              }
               else if(marks<=89 && marks >= 60){
                System.out.println("This is also Good");
               }
              else if(marks<=59 && marks>=0){
                System.out.println("This is Good as well");
              }
              else{
                System.out.println("Invalid marks");
              } 

              System.out.println("Because marks dont matter");
            }
          else if(n==0){
            System.out.println("exiting the program .....");
          }
          else{
            System.out.println("Invalid input : Please enter a number between 0 or 1");
          }

        } while (n==1);

        sc.close();
  }
}
