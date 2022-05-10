public class MethodMain2 {
   public static void main(String[] args){
      MethodSample2 ms2 = new MethodSample2();
      int result;
      // call method as arg 10
      result = ms2.add(10, 1);
      System.out.println(result);
      System.out.println(ms2.add(20, -2));
      // ms2.add();
   }
}
