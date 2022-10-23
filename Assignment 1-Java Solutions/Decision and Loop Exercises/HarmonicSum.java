public class HarmonicSum {
  public static void main(String[] args) {
    final int MAX_DENOMINATOR = 50000;
    double sumL2R = 0.0, sumR2L = 0.0, absDiff;

    for (int denominator=1; denominator<=MAX_DENOMINATOR; denominator++) 
      sumL2R += 1.0/denominator;
    System.out.println("Sum from left-to-right: " + sumL2R);

    for (int denominator=MAX_DENOMINATOR; denominator>=1; denominator--) 
      sumR2L += 1.0/denominator;
    System.out.println("Sum from right-to-left: " + sumR2L);

    absDiff = (sumL2R>sumR2L) ? sumL2R-sumR2L : sumR2L-sumL2R;
    System.out.println("Their Absolute Difference: " + absDiff);
  }
}
