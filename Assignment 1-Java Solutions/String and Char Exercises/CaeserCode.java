import java.util.Scanner;

public class CaeserCode {
  private static Scanner reader = new Scanner(System.in);
  public static void encode() {
    System.out.print("Enter a plaintext string: ");
    char ch;
    String input = reader.next().toUpperCase();

    System.out.print("The ciphertext string is: ");
    for (int i=0; i<input.length(); i++) {
      ch = input.charAt(i);
      if (ch >= 'A' && ch <= 'W')
        System.out.print((char)(ch + 3));
      else if (ch == 'X')
        System.out.print('A');
      else if (ch == 'Y')
        System.out.print('B');
      else if (ch == 'Z')
        System.out.print('C');
    }
    System.out.println();
  }
  public static void decode() {
    System.out.print("Enter a ciphertext string: ");
    char ch;
    String input = reader.next().toUpperCase();

    System.out.print("The plaintext string is: ");
    for (int i=0; i<input.length(); i++) {
      ch = input.charAt(i);
      if (ch >= 'D' && ch <= 'Z')
        System.out.print((char)(ch - 3));
      else if (ch == 'A')
        System.out.print('X');
      else if (ch == 'B')
        System.out.print('Y');
      else if (ch == 'C')
        System.out.print('Z');
    }
    System.out.println();
  }
  public static void main(String[] args) {
    System.out.print("Encode or Decode Text? : ");
    String input;
    while (true) {
      input = reader.next().toLowerCase();
      if (input.equals("encode") || input.equals("decode"))
        break;
      System.out.print("Enter a  valid input (Encode/Decode): ");
    }

    if (input.equals("encode"))
      encode();
    else if (input.equals("decode"))
      decode();
  }
}
