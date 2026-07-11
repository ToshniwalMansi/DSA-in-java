// Check iif an array is sorted (Strictly increasing)

public class CheckIncreasingArray {
  static int answer = 1;

  public static void checkOrder(int[] numbers , int i){

    if(i == (numbers.length-1)){
      if(answer == 0){
        System.out.println("Array is not sorted .");
      }
      else{
        System.out.println("Arrray is sorted .");
      }
      return;
    }


    if(numbers[i] > numbers[i+1]){
     answer = 0;
    }
    checkOrder(numbers, i+1);
  }

  public static void main(String[] args) {
      int[] numbers = {1,7,3,4,5,6,7,8,9,10};
      checkOrder(numbers, 0);
  }
}
