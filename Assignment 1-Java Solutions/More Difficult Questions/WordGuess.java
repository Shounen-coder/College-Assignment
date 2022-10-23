import java.util.Scanner;

public class WordGuess {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    String string = args[0];
    int trails = 1, length = string.length(), found_count = 0;
    boolean[] found = new boolean[length];
    char ch, ch2;

    while (true) {
      System.out.print("Key in one character or your guess word: ");
      ch = reader.next().charAt(0);

      System.out.print("Trail " + trails + ": ");
      for (int i=0; i<length; i++) {
        ch2 = string.charAt(i);
        if (ch == ch2 && !found[i]) {
          found[i] = true;
          found_count++;
        }
        System.out.print((found[i]) ? ch2 : '_');
      }
      System.out.println();

      if (found_count == length) {
        System.out.println("Congratulations!\nYou got in " + trails + " trials");
        break;
      }
      trails++;
    }
  }
}
