import java.util.Scanner;

public class Exponent {
  public static int exponent(int base, int exp) {
    int product = 1;
    for (int i=1; i<=exp; i++)
      product *= base;
    return product;
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Enter the base: ");
    int base = reader.nextInt();

    System.out.print("Enter the exponent: ");
    int exp = reader.nextInt();

    System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
  }
}
