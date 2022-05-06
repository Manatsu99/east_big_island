import java.util.Scanner;

public class IfSample3 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String s = scanner.nextLine();
      System.out.println( s == "abc");
      System.out.println( s.equals("abc"));

      System.out.println("abc" == "abc");
   }
}
