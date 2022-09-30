public class PrimesBetween1And100 {
  public static void main(String[] args) {
    System.out.print("2 "); // only even prime number
    for (int i=1; i<=100; i++) {
      for (int j=2; j<i; j++) {
        if (i%j==0)
          break;
        if (j==i-1)
          System.out.print(i + " ");
      }
    }
  }
}