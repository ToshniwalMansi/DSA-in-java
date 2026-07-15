public class RecursionPalindrome {
  public static boolean palindrom(String num , int i , int n){
    
    if(i==n || i>n ){
      return true;
    }
    if(num.charAt(i) == num.charAt(n)){
      return palindrom(num,  i+1, n-1);
      
    }
    else{
      return false;
    }
  }

  public static void main(String[] args) {
    String num = "NaaN";
    boolean ans =  palindrom(num,  0, num.length()-1);
    System.out.println(ans);
  }
}
