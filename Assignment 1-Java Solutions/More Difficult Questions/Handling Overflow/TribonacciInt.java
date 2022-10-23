public class TribonacciInt {
  private static int tribonacci(int n) {
    int tn, tnMinus1 = 1, tnMinus2 = 0, tnMinus3 = 0;
    for (int i=0; i<=n; i++) {
      tn = tnMinus1 + tnMinus2 + tnMinus3;
      tnMinus3 = tnMinus2;
      tnMinus2 = tnMinus1;
      tnMinus1 = tn;
    }
    return tn;
  }
  public static void main(String[] args) {
    int n = 1, t;
    int tminus1 = tribonacci(n-1), tminus2 = tribonacci(n-2), tminus3 = tribonacci(n-3);
    while (true) {
      if ((Integer.MAX_VALUE - tminus1 - tminus2) < tminus3) {
        System.out.println("Tribonacci(" + n + ") is out of the range of int");
        break;
      }
      t = tribonacci(n);
      System.out.println("Tribonacci(" + n +") = " + t);
      tminus3 = tminus2;
      tminus2 = tminus1;
      tminus1 = t;
      n++;
    }
  }
}
