public class SwitchSample {
   public static void main(String[] args) {
      int num;
      num = 1;

      switch (num) {
         case 10:
         case 20: 
            System.out.println("A");
            break;
         case 30:
            System.out.println("B");
         case 40:
            System.out.println("C");
         default:
            System.out.println("0");
            break;
      }
      System.out.println("ENDs");
   }
}
