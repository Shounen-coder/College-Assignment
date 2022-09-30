import java.util.Scanner;

public class Primes {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = reader.nextInt();

    for (int i=2; i<=num/2; i++) {
      if (num%i==0) {
        System.out.println(num + " is not a Prime");
        return;
      }
    }
    System.out.println(num + " is a Prime");
  }
}
