import java.util.Scanner;

public class Fibonacci {
  public static long fibonacci(int n) {
    return (n == 0 || n == 1) ?  n : fibonacci(n-1) + fibonacci(n-2);
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Enter an Integer: ");
    int num = reader.nextInt();
    System.out.println("Fibonacci number of " + num + " is " + fibonacci(num));
  }
}
