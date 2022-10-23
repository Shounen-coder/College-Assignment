public class ExponentialSeries {
  public static double exp(int numTerms) {
    double sum = 0.0;
    for (int i=10; i>0; i--)
      sum = 1+sum/i;
    return sum;
  }
  public static double exp(double x, int numTerms) {
    double sum = 0.0;
    for (int i=numTerms; i>0; i--)
      sum = 1+x*sum/i;
    return sum;
  }
  public static void main(String[] args) {
    System.out.println("Computed values:");

    double x = 2.0; // input (in radians)
    double value = exp(x, 10);
    System.out.printf("e^%.1f = %.4f%n (%.2f%% accuracy)%n", x, value, (value*100.0/Math.exp(x)));
  }
}