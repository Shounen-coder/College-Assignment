import javax.crypto.Cipher;

public class FibonacciInt {
  public static int fibonacci(int n) {
    if (n <= 1)
      return 0;

    int fminus1 = 1, fminus2 = 0, f = 0;
    for (int i=0; i<n; i++) {
      f = fminus1 + fminus2;
      fminus2 = fminus1;
      fminus1 = f;
    }
    return f;
  }
  public static void main(String[] args) {
    int n = 1, f;
    int fMinus1 = fibonacci(n-1), fMinus2 = fibonacci(n-2);
    while (true) {
      if ((Integer.MAX_VALUE - fMinus1) < fMinus2) {
        System.out.println("Fibonacci(" + n + ") is out of the range of int");
        break;
      }
      f = fibonacci(n);
      System.out.println("Fibonacci(" + n +") = " + f);
      fMinus2 = fMinus1;
      fMinus1 = f;
      n++;
    }
  }
}
