public class Example {
   public static void main(String[] args) throws Exception {
      // finding the time before the operation is executed
      long start = System.currentTimeMillis();
      for (int i = 0; i <5; i++) {
         Thread.sleep(60);
      }
      // finding the time after the operation is executed
      long end = System.currentTimeMillis();
      float msec = end - start;
      // finding the time difference
      System.out.println(msec + " milliseconds");
   }
}
