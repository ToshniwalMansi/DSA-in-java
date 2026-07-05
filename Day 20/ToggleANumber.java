Write a program to toggle a bit a position = “pos” in a number “n”.


import java.util.*;
public class ToggleANumber {
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number : ");
    int number = sc.nextInt();

    System.out.print("Enter the position you wanna toggle : ");
    int pos = sc.nextInt();

    int bitMask = 1<<pos ;
    int value = bitMask & number ; 

    if(value == 0){
      int answer = number | bitMask ;
      System.out.print("Number after toggling is : " + answer);
    }
    else{
      
      int answer = number & ~bitMask ;
      System.out.print("Number after toggling is : " + answer);
    }
  }
}
