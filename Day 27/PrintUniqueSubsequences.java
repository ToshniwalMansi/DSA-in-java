// Print all unique subsequnces of a string

import java.util.HashSet;
public class PrintUniqueSubsequences {
  public static void printSubsequences(String str , int index , String subString , HashSet<String> set){

    if(index == str.length()){
      if(set.contains(subString)){
        return;
      }
      else{
        System.out.println(subString);
        set.add(subString);
        return;
      }
    }

    char currChar = str.charAt(index);

    // if the letter appears
    printSubsequences(str, index+1, subString + currChar, set);

    // if not appears
    printSubsequences(str, index+1, subString, set);
  }

  public static void main(String[] args) {
      String str = "aaa";
      HashSet<String> set = new HashSet<>();
      printSubsequences(str, 0, "", set);
  }
}
