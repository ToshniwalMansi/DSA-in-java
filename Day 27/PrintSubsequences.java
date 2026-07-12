// Print all subsequences of a String


public class PrintSubsequences {
  public static void subsequences(String str , int index , String newString){

    if(index == str.length()){
      System.out.println(newString);
      return;
    }

    char currChar = str.charAt(index);

    // if it appears
    subsequences(str, index+1, newString+currChar);

    // if it does not want to appear
    subsequences(str, index+1, newString);
  }

  public static void main(String[] args) {
      String str = "abc";
      subsequences(str, 0, "");
  }
  
}
