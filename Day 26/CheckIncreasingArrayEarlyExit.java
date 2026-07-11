public class CheckIncreasingArrayEarlyExit {
  static int answer = 1;

  public static void checkOrder(int[] numbers , int i){


    if( answer == 0){
      System.out.println("It is not sorted");
      return;
    }
    if(i == (numbers.length-1)){
      
        System.out.println("Array is sorted .");
        return;
     
    }


    if(numbers[i] > numbers[i+1]){
     answer = 0;
    }
    checkOrder(numbers, i+1);
  }

  public static void main(String[] args) {
      int[] numbers = {1,7,8};
      checkOrder(numbers, 0);
  }
}
