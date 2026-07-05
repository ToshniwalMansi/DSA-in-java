import java.util.*;
public class UpdateBit {
  
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    int n = 5;
    System.out.print("Enter the postition you want to update : ");
    int position = sc.nextInt();

    System.out.println("What do you want to set it to 0 or 1 ? ");
    int setter = sc.nextInt();

    int bitMask = 1<<position;

    if(setter == 0){
      //clear bit
      int not = ~(bitMask);
      int answer = not & n;
      System.out.println("Ok updation successful , answer is : " + answer);
    }
    else if(setter == 1){
      //set bit
      int answer = n | bitMask;
      System.out.println("Ok updation successful , answer is : " + answer);
    }
    else{
      System.out.println("The number is invalid !!!");
    }


  }
}
