import java.util.Scanner;

public class ReverseInteger {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter an Integer: ");
    int num = reader.nextInt();
    System.out.print("Reversed Integer is: ");
    while (num > 0) {
      System.out.print(num%10);
      num /= 10;
    }
  }
}