public class SpecialSeries {
  public static double specialSeries(double x, int numTerms) {
    double sum = 0.0, fraction_product = 1.0;
    double x_power_n = x;

    for (int i=0; i<numTerms; i++) {
      sum += fraction_product * (x_power_n/(2*i+1));
      fraction_product *= (double)(2*i+1)/(2*(i+1));
      x_power_n *= x*x;
    }
    return sum;
  }
  public static void main(String[] args) {
    double x = 0.5; // -1 <= x <= 1
    int numTerms = 10;
    System.out.printf("Value of Special series for number %.1f is: %.7f%n", x, specialSeries(x, numTerms));
  }
}
