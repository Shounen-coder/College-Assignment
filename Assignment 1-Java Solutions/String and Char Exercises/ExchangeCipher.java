import java.util.Scanner;

public class ExchangeCipher {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Enter a plaintext string: ");
    String input = reader.next().toUpperCase();

    System.out.print("The ciphertext string is: ");
    for (int i=0; i<input.length(); i++)
      System.out.print((char)('A' + 'Z' - input.charAt(i)));
    System.out.println();
  }
}
