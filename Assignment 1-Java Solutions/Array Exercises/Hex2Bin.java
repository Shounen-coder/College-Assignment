import java.util.Scanner;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class Hex2Bin {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    final String[] HEX_BITS = {
      "0000", "0001", "0010", "0011",
      "0100", "0101", "0110", "0111",
      "1000", "1001", "1010", "1011",
      "1100", "1101", "1110", "1111"
    };

    System.out.print("Enter a Hexadecimal string: ");
    String input = reader.next().toLowerCase();
    int length = input.length()-1;

    System.out.print("The equivalent binary for hexadecimal " + input + " is: ");
    for (int i=0; i<=length; i++) {
      char ch = input.charAt(i);
      if (ch >= '0' && ch <= '9')
        System.out.print(HEX_BITS[ch-48] + " ");
      else if (ch >= 'a' && ch <= 'z')
        System.out.print(HEX_BITS[ch-87] + " ");
    }
  }
}
