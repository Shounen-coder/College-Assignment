import java.util.Scanner;

public class PrimeList {
  public static boolean isPrime(int num) {
    if (num < 1)
      return false;

    for (int i=2; i<=Math.sqrt(num); i++) {
      if (num%i==0)
        return false;
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int primeCount = 0;

    System.out.print("Please enter the upper bound: ");
    int upperBound = reader.nextInt();

    for (int i=1; i<upperBound; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
        primeCount++;
      }
    }
    System.out.printf("%n[%d primes found (%.2f%%)]%n", primeCount, (primeCount*100.0/upperBound));
  }
}