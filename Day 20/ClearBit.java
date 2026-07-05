public class ClearBit {
  
  public static void main(String[] args) {
      
    int n = 5;
    int position = 2;
    int bitMask = 1 << position;

    int not = ~(bitMask);
    int answer = n & not;

    System.out.println(answer);
  }
}
