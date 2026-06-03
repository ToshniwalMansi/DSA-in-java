//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class CircumferenceFunction {
  
  public static void circumference(float a){
    double circumference ;
    circumference = 2*3.14*a;

    System.out.println("The circumference for the circle is : " + circumference);
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the radius of circle : ");
      float a = sc.nextFloat();

      sc.close();

      circumference(a);
  }
}
