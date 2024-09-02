public class Seven {
  public static void main(String[] args) {
    double quarterPi = 0;

    for (int i = 0; i < 10000; i++) {
      quarterPi += 1.0 / (1 + 2 * i) * (i % 2 == 0 ? 1 : -1);
    }

    double pi = quarterPi * 4;
    System.out.println(pi);
  }
}
