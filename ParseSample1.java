import java.util.Scanner;

public class ParseSample1 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      String userInput;
      userInput = scanner.nextLine();
      System.out.println(userInput + 10);

      int a;
      a = Integer.parseInt(userInput);
      // a = Integer.parseInt("10");
      System.out.println(a+10);

      String result;
      result = String.valueOf(a+10);
      System.out.println(result);
      scanner.close();
   }
}
