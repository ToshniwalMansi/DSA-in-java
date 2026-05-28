/* Question : Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.

*/

import java.util.*;
public class Calculator{
  public static void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    int a = sc.nextInt();
    System.out.println("Enter the secind number");
    int b = sc.nextInt();
    System.out.println("Enter : \n1 for Addition \n2 for Subtraction \n3 for multiplication \n4 for division \n5 for Modulo");;
    int operation = sc.nextInt();
    float result = 0;

    switch(operation){
      case 1 : result = a + b ;
      System.out.println("The result is : " + result);
      break;

      case 2 : result = a - b ;
      System.out.println("The result is : " + result);
      break;

      case 3 : result = a * b ;
      System.out.println("The result is : " + result);
      break;

      case 4 : result = a / b ;
      System.out.println("The result is : " + result);
      break;

      case 5 : result = a % b ;
      System.out.println("The result is : " + result);
      break;

      default : System.out.println("Selection is invalid");
      break;

    }
    sc.close();


  }
}
