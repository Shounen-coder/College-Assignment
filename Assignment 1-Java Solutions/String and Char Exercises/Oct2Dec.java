import java.util.Scanner;

public class Hex2Dec {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int value = 0;
    boolean isValid = true;

    System.out.print("Enter a Octal string: ");
    String input = reader.next().toLowerCase();
    int len = input.length()-1;

    for (int i=len; i>=0; i--) {
      char ch = input.charAt(i);
      if (ch >= '0' && ch <= '7')
        value += (ch-48) * Math.pow(8, len-i);
      else {
        isValid = false;
        break;
      }
    }
    if (isValid)
      System.out.println("The equivalent decimal number for Octal " + input + " is: " + value);
    else
      System.out.println("Error: Invalid Octal string: \"" + input + "\"");
  }
}