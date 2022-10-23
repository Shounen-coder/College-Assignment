import java.util.Scanner;

public class GreatestCommonDivisor {
  public static int gcd(int a, int b) {
    if (b == 0)
      return a;
    return gcd(b, a%b);
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter an Integer: ");
    int num1 = reader.nextInt();

    System.out.print("Enter an another Integer: ");
    int num2 = reader.nextInt();

    System.out.println("GCD of " + num1 + " & " + num2 + " is: " + gcd(num1, num2));
  }
}