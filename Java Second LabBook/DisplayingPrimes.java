public class DisplayingPrimes {
  public static void main(String[] args) {
    String primeNumbers = "";
    for (int i=1; i<=100; i++) {
      int counter = 0;
      for (int num=i; num>=1; num--) {
        if (i%num==0)
          counter = counter + 1;
      }
      if (counter == 2)
        primeNumbers = primeNumbers + i + " ";
    }
    System.out.println("Primes between 1 & 100 are :" + primeNumbers);
  }
}
