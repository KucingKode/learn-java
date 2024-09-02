public class Four {
  public static void main(String[] args) {
    System.out.println("a\ta^2\ta^3");

    for (byte i = 0; i < 5; i++) {
      System.out.println(i + "\t" + Math.pow(i, 2) + "\t" + Math.pow(i, 3));
    }
  }
}
