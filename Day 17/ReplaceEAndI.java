//Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
//Example : 
//original = “eabcdef’ ; result = “iabcdif”
//Original = “xyz” ; result = “xyz”


import java.util.*;

public class ReplaceEAndI{
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the string : ");
    String name = sc.next();

    String result = "";

    /*for(int i=0 ; i<name.length() ; i++){
      if(name.charAt(i) == 'e'){
        result = result + 'i';
      }
      else{
        result = result + name.charAt(i);
      }
    }

    System.out.println(result);
   */

    for(int i=0 ; i<name.length() ;i++){
      if(name.charAt(i) == 'e'){
        System.out.print("i");
      }
      else{
        System.out.print(name.charAt(i));
      }
    }

  }
}
