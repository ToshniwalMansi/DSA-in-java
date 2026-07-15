public class RecusrionReverseAString {
  
  public static String reverse(String name, int length, String reverse){

    if(length < 0){
      return reverse ;
    }
    reverse = reverse + name.charAt(length) ;
    return reverse(name, length-1, reverse);
    
  }

  public static void main(String[] args) {
      String name = "mansi";
      int length = name.length();
      String ans = reverse(name, length-1,"");
      System.out.println(ans);
  }
}
