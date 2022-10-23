import java.util.Scanner;

public class OddEvenTest {
  public static boolean isOdd(int number) {
    if (number < 0)
      number = -number;
    return number%2==1;
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int number = reader.nextInt();

    if (isOdd(number))
      System.out.println(number + " is an odd number");
    else
      System.out.println(number + " is an even number");
  }
}
