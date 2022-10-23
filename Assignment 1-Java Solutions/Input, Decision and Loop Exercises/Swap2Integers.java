import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Swap2Integers {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter an Integer: ");
    int number1 = reader.nextInt();

    System.out.print("Enter an another Integer: ");
    int number2 = reader.nextInt();

    System.out.println("Before swapping:");
    System.out.println("number1 = " + number1);
    System.out.println("number2 = " + number2);

    int temp = number1;
    number1 = number2;
    number2 = temp;

    System.out.println("\nAfter swapping:");
    System.out.println("number1 = " + number1);
    System.out.println("number2 = " + number2);

  }
}
