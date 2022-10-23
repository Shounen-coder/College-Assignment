import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Dec2Hex {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    final char[] HEX_VALUES = {
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
      'A', 'B', 'C', 'D', 'E', 'F'
    };
    int[] hexNum = new int[100];
    int length = 0;

    System.out.print("Enter a decimal number: ");
    int input = reader.nextInt();

    while (input != 0) {
      hexNum[length] = input%16;
      input /= 16;
      length++;
    }

    System.out.print("The equivalent hexadecimal number is: ");
    for (int i=length-1; i>=0; i--)
      System.out.print(HEX_VALUES[hexNum[i]]);
  }
}
