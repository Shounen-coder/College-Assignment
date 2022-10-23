import java.util.Scanner;

public class Factorial {
  public static long factorial(int n) {
    return (n == 1) ? 1 : n * factorial(n-1);
  }
  public static void main(String[] args) {    
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter an Integer: ");
    int num = reader.nextInt();
    System.out.println("Factorial of " + num + " is " + factorial(num));
  }
}
