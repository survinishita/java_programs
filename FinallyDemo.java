public class FinallyDemo {
  public static void main(String[] args) {
    try {
      int r = 10 / 0;
      System.out.println(r);
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by 0");
    } finally {
      System.out.println("Finally always runs");
    }
  }
}