import java.util.*;
public class HashSetTrial {
  
  public static void main(String[] args) {
      Set<Integer> accountNo = new HashSet<>();

      accountNo.add(10);
      accountNo.add(11);
      accountNo.add(15);
      accountNo.add(19);
      accountNo.add(5);
      accountNo.add(10);

      System.out.println(accountNo);

      boolean find5 = accountNo.contains(5);
      System.out.println(find5);

      System.out.println(accountNo.size());

      System.out.println(accountNo.isEmpty());

      Set<String> names = new HashSet<>();
      
      
  }
}
