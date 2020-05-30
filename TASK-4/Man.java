public class Man {
  public static void main(final String[] args) {
    final ma_n maninInfo = new ma_n("Fajlul Karim Chowdhury", 28, "Shewrapara, Mirpur", "Man");
    final student stdInfo = new student(505, 9, 2.7, maninInfo);
      System.out.println(stdInfo.toString2());
      System.out.println(maninInfo.toString2());
      System.out.println(stdInfo.toString());
  }
 

}