public class Eleven {
  public static void main(String[] args) {
    float bps = 1f / 7;
    float dps = -1f / 13;
    float ips = 1f / 45;
    double pop = 312_032_486;
    short daysPerYear = 365;
    byte years = 5;

    int secondsPerYear = daysPerYear * 24 * 3600;

    for (byte i = 0; i < years; i++) {
      pop += (bps + dps + ips) * secondsPerYear;
      System.out.println(Math.floor(pop));
    }
  }
}
