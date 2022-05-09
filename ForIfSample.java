public class ForIfSample {
   public static void main(String[] args) {
      /** 以下の表示を行う
       * 0は偶数です
       * 2は偶数です
       * 4は偶数です
       * 
       * 問題を簡単にするには？
       * 0から4まで表示する
       */

       for (int i = 0; i <= 4; i++) {
          if (i%2==0) {
             System.out.println(i+"は偶数です");
          }
       }
   }
}
