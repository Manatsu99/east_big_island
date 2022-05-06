public class IfSample4 {
   public static void main(String[] args) {
      // 論理演算子
      System.out.println(!true);
      System.out.println(!false);
      System.out.println(true && true);
      System.out.println(true && false);
      System.out.println(false && false);
      System.out.println(true || false);
      System.out.println(false || false);
      
      boolean isAdult;
      isAdult = true;
      System.out.println(!isAdult);
      
      int week;
      week = 1;
      
      // if Wed && 20over
      System.out.println(week == 3 && isAdult);
   }
}
