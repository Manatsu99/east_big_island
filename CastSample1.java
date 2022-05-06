public class CastSample1 {
   public static void main(String[] args) {
      byte b1;
      short s1;
      b1 = 127;
      s1 = b1;
      s1 = 128;
      b1 = (byte)s1;
      System.out.println(b1);
   }
}
