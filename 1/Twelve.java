public class Twelve {
  public static void main(String[] args) {
    byte miles = 24;
    double hours = 1 + 40 / 60 + 30 / 3600;
    double kmph = miles * 1.6 / hours;
    System.out.println(precision(kmph, (byte) 2));
  }

  static double precision(double x, byte precision) {
    int mul = (int) Math.pow(10, precision);
    System.out.println(mul);
    return Math.floor(x * mul) / mul;
  }
}
