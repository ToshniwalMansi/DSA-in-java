public class StringCompare {
  public static void main(String[] args) {
      

    System.out.println("---Same name ---");
    String name1 = "tony";
    String name2 = "tony" ;

    if(name1.compareTo(name2) == 0){
      System.out.println("The strings are equal");
    }
    else{
      System.out.println("String are not equal");
    }

     System.out.println("---Same name different starting---");
    String name3 = "sony";
    String name4 = "tony" ;

    if(name3.compareTo(name4) == 0){
      System.out.println("The strings are equal");
    }
    else{
      System.out.println("String are not equal");
    }

     System.out.println("---different length ---");
    String name5 = "mansi";
    String name6 = "tony" ;

    if(name5.compareTo(name6) == 0){
      System.out.println("The strings are equal");
    }
    else{
      System.out.println("String are not equal");
    }

    System.out.println("--- When we compare directly ---");
    String name = "mansi";
    String names = " rashi";

    if(name == names ){
      System.out.println("The strings are equal ");
    }
    else{
      System.out.println("String are not equal");
    }

    System.out.println("--- When we compare directly ---");
    name = "mansi";
    names = "mansi";

    if(name == names ){
      System.out.println("The strings are equal ");
    }
    else{
      System.out.println("String are not equal");
    }

    System.out.println("---Creating String inside if loop---");
    if(new String("tony") == new String("tony")){
      System.out.println("The strings are equal");
    }
    else{
      System.out.println("String are not equal");
    }

  }
}
