public class StringBuilders {
  public static void main(String[] args) {
      
    StringBuilder sb = new StringBuilder("Tony");

    //print
    System.out.println(sb);

    //set char at index
    sb.setCharAt(0,'p');
    System.out.println("name after setting p : " + sb);

    //insert char at index
    sb.insert(0,'s');
    System.out.println("After inserting : " + sb);
    sb.insert(3,'n');
    System.out.println("After inserting : " + sb);

    //delete the extra n 
    sb.delete(2,3);
    System.out.println("After deleting : " + sb);
    sb.delete(1,3);
    System.out.println("After deleting : " + sb);

    //append
    StringBuilder sbb = new StringBuilder("H");
    sbb.append("EL");
    sbb.append("L");
    sbb.append("L");
    sbb.append("O");
    System.out.println("After appending : " + sbb);

  }
}
