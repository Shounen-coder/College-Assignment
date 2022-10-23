import java.util.Scanner;

public class CountVowelsDigits {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    char ch;
    int digits = 0, vowels = 0;

    System.out.print("Enter a String: ");
    String inStr = reader.next().toLowerCase();
    int inStrLen = inStr.length();

    for (int i=0; i<inStrLen; i++) {
      ch = inStr.charAt(i);
      if (Character.isDigit(ch))
        digits++;
      else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        vowels++;
    }

    double vowelsPercentage = (vowels*100.0/inStrLen);
    double digitsPercetage = (digits*100.0/inStrLen);

    System.out.printf("Number of vowels: %d (%.2f%%)%n", vowels, vowelsPercentage);
    System.out.printf("Number of digits: %d (%.2f%%)%n", digits, digitsPercetage);
  }
}
