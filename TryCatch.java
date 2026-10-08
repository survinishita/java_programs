public class TryCatch {
  public static void main(String[] args) {
    try {
      int[] a = new int[3];
      a[5] = 10;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: "
          + e.getMessage());
    }
    System.out.println("Program continues");
  }
}
