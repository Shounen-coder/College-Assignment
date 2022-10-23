import java.util.Scanner;

public class Bin2Dec {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int value = 0;
    boolean isValid = true;

    System.out.print("Enter a Binary string: ");
    String input = reader.next();
    int len = input.length()-1;

    for (int i=len; i>=0; i--) {
      char ch = input.charAt(i);
      if (ch == '1')
        value += Math.pow(2, len-i);
      else if (ch != '0' && ch != '1') {
        isValid = false;
        break;
      }
    }
    if (isValid)
      System.out.println("The equivalent decimal number for binary " + input + " is: " + value);
    else
      System.out.println("Error: Invalid Binary string: \"" + input + "\"");
  }
}