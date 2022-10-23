import java.util.Scanner;

public class Hex2Dec {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int value = 0;

    System.out.print("Enter the radix: ");
    int radix = reader.nextInt();

    if (radix < 0 || radix > 16) {
      System.out.println("Invalid Radix base: " + radix);
      return;
    }

    System.out.print("Enter the string: ");
    String input = reader.next().toLowerCase();
    int len = input.length()-1;

    boolean alpha_chars_check = radix>=11 && radix<=16;

    for (int i=len; i>=0; i--) {
      char ch = input.charAt(i);
      if (ch >= 'a' && ch <= 'f' && alpha_chars_check && ch-87 <= radix-1)
        value += (ch-87) * Math.pow(radix, len-i); // ch-97 + 10

      else if (ch >= '0' && ch <= '9' && ch-48 <= radix-1)
        value += (ch-48) * Math.pow(radix, len-i);
    }
    System.out.println("The equivalent decimal number is: " + value);
  }
}