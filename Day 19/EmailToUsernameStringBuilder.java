/*
Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123”
  */

import java.util.*;
public class EmailToUsernameStringBuilder {
  
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your Mail ID : ");
    StringBuilder sb = new StringBuilder(sc.next());

    System.out.println("Your username is : ");

    for(int i=0 ; i<sb.length() ; i++){
      if(sb.charAt(i) == '@'){
        break;
      }
      else{
        System.out.print(sb.charAt(i));
      }
    }
  }
}
