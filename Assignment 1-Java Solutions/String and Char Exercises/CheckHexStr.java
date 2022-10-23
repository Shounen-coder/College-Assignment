import java.util.Scanner;

public class CheckHexStr {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    char ch;
    boolean isValid = true;

    System.out.print("Enter a hex string: ");
    String input = reader.next();
    for (int i=0; i<input.length(); i++) {
      ch = input.charAt(i);
      if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F') || (inChar >= 'a' && inChar <= 'f'))) {
        isValid = false;
        break;
      }
    }

    if (isValid)
      System.out.println("\"" + input + "\" is a hex string");
    else
      System.out.println("\"" + input + "\" is NOT a hex string");
  }
}
