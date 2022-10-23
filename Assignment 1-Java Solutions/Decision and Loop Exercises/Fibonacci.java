public class Fibonacci {
  public static void main(String[] args) {
    int n = 3, fn, fnMinus1 = 1, fnMinus2 = 0, nMax = 20;
    int sum = fnMinus1 + fnMinus2;
    double average;
    System.out.println("The 1st " + nMax + " Fibonacci numbers are:");
    System.out.print(fnMinus2 + " " + fnMinus1 + " ");
    while (n <= nMax) {
      fn = fnMinus1 + fnMinus2;
      System.out.print(fn + " ");
      sum += fn;
      n++;
      fnMinus2 = fnMinus1;
      fnMinus1 = fn;
    }
    System.out.println("\nAverage is: " + (sum/nMax));
  }
}