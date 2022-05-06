import java.util.Scanner;

public class ScannerSample {
   public static void main(String[] args) {
      Scanner scan; // scan宣言
      scan = new Scanner(System.in); //Scanner型のオブジェクト生成
      System.out.println("入力してください");
      System.out.println("入力内容: " + scan.nextLine());
      String userInput;
      userInput = scan.nextLine();
      // nextLine()によってStringのデータが得られる．
      System.out.println("output: "+userInput);
      
      String input = "";
      do {
         System.out.print("input: ");
         input = scan.next();
         System.out.println("output: "+input);
      } while (!input.equals("exit"));
      System.out.println("Exit!");
      scan.close();
   }
}
