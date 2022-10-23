import java.util.Scanner;

public class SumOfDigitsInt {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int sum = 0;

    System.out.print("Enter a positive Integer: ");
    int num = reader.nextInt();
    while (num > 0) {
      sum += num%10;
      num /= 10;
    }
    System.out.println("The sum of all digits is: " + sum);
  }
}
