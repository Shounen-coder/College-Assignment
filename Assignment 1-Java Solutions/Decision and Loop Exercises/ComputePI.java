public class ComputePI {
  public static double ComputePiMaxDenominator(int max_denominator) {
    double sum = 0.0;
    for (int denominator=1; denominator<=max_denominator; denominator+=2) {
      if (denominator%4==1)
        sum += 1.0/denominator;
      else if (denominator%4==3)
        sum -= 1.0/denominator;
      else {
        System.out.println("Impossible!!!");
        return 0.0;
      }
    }
    return 4*sum;
  }
  public static double ComputePiMaxTerm(int max_term) {
    double sum = 0.0;
    for (int term=1; term<=max_term; term++) {
      if (term%2==1)
        sum += 1.0/(term*2-1);
      else
        sum -= 1.0/(term*2-1);
    }
    return 4*sum;
  }
  public static void main(String[] args) {
    double piComputed = ComputePiMaxDenominator(1000000);

    // Max Denominator
    System.out.println("Pi value till 1000th demonimator: " + ComputePiMaxDenominator(1000));
    System.out.println("Pi value till 10000th demonimator: " + ComputePiMaxDenominator(10000));
    System.out.println("Pi value till 100000th demonimator: " + ComputePiMaxDenominator(100000));
    System.out.println("Pi value till 1000000th demonimator: " + piComputed);

    // Max Term
    System.out.println("Pi value till 1000th term: " + ComputePiMaxTerm(1000));
  
    float accuracy = (float) (piComputed/Math.PI) * 100;
    System.out.println("Computed Pi is " + accuracy + "% accurate, compared to Math.PI");
  }
}
