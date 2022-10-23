import java.util.Scanner;

public class PerfectPrimeFactorList {
  public static boolean isPrime(int num) {
    if (num < 1)
      return false;

    for (int i=2; i<=Math.sqrt(num); i++) {
      if (num%i==0)
        return false;
    }
    return true;
  }
  public static boolean isProductOfPrimeFactors(int num) {
    long product = 1;
    for (int i=2; i<=num; i++) {
      if (num%i==0 && isPrime(i))
        product *= i;
    }
    return product==num && !isPrime(num);
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int primeCount = 0;

    System.out.print("Please enter the upper bound: ");
    int upperBound = reader.nextInt();

    System.out.println("These numbers are equal to the product of prime factors (excluding the primes): ");
    for (int i=1; i<upperBound; i++) {
      if (isProductOfPrimeFactors(i)) {
        System.out.print(i + " ");
        primeCount++;
      }
    }

    System.out.printf("%n[%d numbers found (%.2f%%)]%n", primeCount, (primeCount*100.0/upperBound));
  }
}
