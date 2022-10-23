import java.util.Scanner;

public class HasEight {
  public static boolean hasEight(int number) {
    String num = Integer.toString(number);
    for (int i=0; i<num.length(); i++) {
      if (num.charAt(i) == '8')
        return true;
    }
    return false;
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    final int SENTINEL = -1;
    int number, sum = 0;

    while (true) {
      System.out.print("Enter a positive integer (or -1 to end): ");
      number = reader.nextInt();

      if (number == SENTINEL) {
        System.out.println("The magic sum is: " + sum);
        break;
      } else if (hasEight(number))
        sum += number;
    }
  }
}