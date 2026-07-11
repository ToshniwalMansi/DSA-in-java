//Move all the 'x' to the end of string
public class PrintXAtEnd {
  
  public static void printAtENd(String str , int i , char element , int counter){

    if( i == str.length()){

     for( int j=0 ; j<counter ; j++){
      System.out.print(element);
      
     }
     return;
    }
    
    if(element == str.charAt(i)){
      counter++;
      
    }
    else{
      System.out.print(str.charAt(i));
    }
    printAtENd(str, i+1, element, counter);
    
  }

  public static void main(String[] args) {
      String str = "axbcxxx";
      printAtENd(str, 0, 'x', 0);
  }
}
