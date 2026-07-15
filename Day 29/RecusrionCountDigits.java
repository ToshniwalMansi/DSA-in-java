public class RecusrionCountDigits {
  
  public static void count(int num , int count){

    if(num < 0){
      num = -num;
    }
    if(num == 0){
      System.out.println("the digits are : " + count);
      return;
    }

    num = num/10;
    count++;
    count(num, count);
  }

  public static void main(String[] args) {
      count(-520000000, 0);
  }
}
