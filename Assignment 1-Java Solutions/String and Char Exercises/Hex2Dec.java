import java.util.Scanner;

public class Hex2Dec {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int value = 0;
    boolean isValid = true;

    System.out.print("Enter a Hexadecimal string: ");
    String input = reader.next().toLowerCase();
    int len = input.length()-1;

    for (int i=len; i>=0; i--) {
      char ch = input.charAt(i);
      if (ch >= 'a' && ch <= 'f')
        value += (ch-97 + 10) * Math.pow(16, len-i);
      else if (ch >= '0' && ch <= '9')
        value += (ch-48) * Math.pow(16, len-i);
      else {
        isValid = false;
        break;
      }
    }
    if (isValid)
      System.out.println("The equivalent decimal number for hexadecimal " + input + " is: " + value);
    else
      System.out.println("Error: Invalid hexadecimal string: \"" + input + "\"");
  }
}