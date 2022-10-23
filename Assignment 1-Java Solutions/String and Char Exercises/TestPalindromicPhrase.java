import java.util.Scanner;
import java.util.function.BiConsumer;

public class TestPalindromicPhrase {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    boolean isValid = true;
    char fchar, bchar;

    System.out.print("Enter a string: ");
    String input = reader.nextLine().toLowerCase();
    int fIdx=0, bIdx=input.length()-1;

    while (fIdx < bIdx) {
      fchar = input.charAt(fIdx);
      bchar = input.charAt(bIdx);
      if (!Character.isLetter(fchar)) {
        fIdx++;
        continue;
      }
      else if (!Character.isLetter(bchar)) {
        bIdx--;
        continue;
      }
      if (fchar != bchar) {
        isValid = false;
        break;
      }

      fIdx++;
      bIdx--;
    }

    if (isValid)
      System.out.println("\"" + input + "\" is a Palindrome String");
    else
      System.out.println("\"" + input + "\" is nto a Palindrome String");
  }
}