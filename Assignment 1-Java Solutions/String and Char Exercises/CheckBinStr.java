import java.util.Scanner;

public class CheckBinStr {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    char ch;
    boolean isValid = true;

    System.out.print("Enter a binary string: ");
    String input = reader.next();
    for (int i=0; i<input.length(); i++) {
      ch = input.charAt(i);
      if (!(ch == '0' || ch == '1')) {
        isValid = false;
        break;
      }
    }

    if (isValid)
      System.out.println("\"" + input + "\" is a binary string");
    else
      System.out.println("\"" + input + "\" is NOT a binary string");
  }
}
