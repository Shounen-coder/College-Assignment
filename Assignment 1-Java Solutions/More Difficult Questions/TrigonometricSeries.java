import java.util.function.DoubleBinaryOperator;

public class TrigonometricSeries {
  public static double sin(double x, int numTerms) {
    double sum = 0.0;
    for (int n=0; n<=numTerms; n++)
      sum += Math.pow(-1, n)*Math.pow(x, 2*n+1)/factorial(2*n+1);
    return sum;
  }
  public static double cos(double x, int numTerms) {
    double sum = 0.0;
    for (int n=0; n<=numTerms; n++)
      sum += Math.pow(-1, n)*Math.pow(x, 2*n)/factorial(2*n);
    return sum;
  }
  public static long factorial(int n) {
    return (n==0) ? 1 : n * factorial(n-1);
  }
  public static void main(String[] args) {
    double x = 0.0, sin_val, cos_val;

    System.out.println("Computed values:");

    x = 0;
    sin_val = sin(x, 10);
    cos_val = cos(x, 10);
    System.out.printf("  sin(0) = %.4f (%.2f%% accuracy)%n", sin_val, (sin_val*100.0/Math.sin(x)));
    System.out.printf("  cos(0) = %.4f (%.2f%% accuracy)%n%n", cos_val, (cos_val*100.0/Math.cos(x)));

    x = Math.PI/6;
    sin_val = sin(x, 10);
    cos_val = cos(x, 10);
    System.out.printf("  sin(PI/6) = %.4f (%.2f%% accuracy)%n", sin_val, (sin_val*100.0/Math.sin(x)));
    System.out.printf("  cos(PI/6) = %.4f (%.2f%% accuracy)%n%n", cos_val, (cos_val*100.0/Math.cos(x)));

    x = Math.PI/4;
    sin_val = sin(x, 10);
    cos_val = cos(x, 10);
    System.out.printf("  sin(PI/4) = %.4f (%.2f%% accuracy)%n", sin_val, (sin_val*100.0/Math.sin(x)));
    System.out.printf("  cos(PI/4) = %.4f (%.2f%% accuracy)%n%n", cos_val, (cos_val*100.0/Math.cos(x)));

    x = Math.PI/3;
    sin_val = sin(x, 10);
    cos_val = cos(x, 10);
    System.out.printf("  sin(PI/3) = %.4f (%.2f%% accuracy)%n", sin_val, (sin_val*100.0/Math.sin(x)));
    System.out.printf("  cos(PI/3) = %.4f (%.2f%% accuracy)%n%n", cos_val, (cos_val*100.0/Math.cos(x)));

    x = Math.PI/2;
    sin_val = sin(x, 10);
    cos_val = cos(x, 10);
    System.out.printf("  sin(PI/2) = %.4f (%.2f%% accuracy)%n", sin_val, (sin_val*100.0/Math.sin(x)));
    System.out.printf("  cos(PI/2) = %.4f (%.2f%% accuracy)%n%n", cos_val, (cos_val*100.0/Math.cos(x)));
  }
}