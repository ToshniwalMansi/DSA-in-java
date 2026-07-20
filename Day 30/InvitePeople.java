public class InvitePeople {
  
  public static int callQuests(int n){
    if(n<=1){
      return 1;
    }

    // single 
    int ways1 = callQuests(n-1);

    // pair
    int ways2 = (n-1) * callQuests(n-2);

    return ways1 + ways2 ;
  }

  public static void main(String[] args) {
      
    int n=4 ;
    System.out.println(callQuests(n));
  }
}
