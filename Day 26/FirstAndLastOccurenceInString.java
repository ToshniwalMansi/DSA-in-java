public class FirstAndLastOccurenceInString {

  public static int first = -1;
  public static int last = -1;

  public static void firstAndLast(String str , int index , char element){

    if(index == str.length()){
      System.out.println(first);
      System.out.println(last);
      return;
    }

    if(str.charAt(index) == element){
      if(first == -1){
        first = index;
      }
      else{
        last = index;
      }
    }
    firstAndLast(str, index+1, element);
  }

  public static void main(String[] args) {
      String str = "abaacdacfaah";
      firstAndLast(str, 0,'a');
      System.out.println("");
  }
}
