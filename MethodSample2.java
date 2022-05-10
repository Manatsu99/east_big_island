public class MethodSample2 {   
   int add(int a, int b) {
      System.out.println("add " + a);
      if (b < 0){
         System.out.println("add " + b);
         return 0;
      }
      System.out.println(a + b);
      return 10;
   }
}
