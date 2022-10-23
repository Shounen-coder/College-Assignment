public class FactorialLong {
  public static long factorial(int n) {
    return (n == 1) ? 1 : n * factorial(n-1);
  }
  public static void main(String[] args) {
    int n = 1;
    while (true) {
      System.out.println("The factorial of " + n + " is " + factorial(n));
      if ((Long.MAX_VALUE / factorial(n)) < (n+1)) {
        System.out.println("The factorial of " + (n+1) + " is out of range");
        break;
      }
      n++;
    }
  }
}