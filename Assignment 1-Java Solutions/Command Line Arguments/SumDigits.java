import java.io.LineNumberInputStream;

public class SumDigits {
  public static void main(String[] args) {
    if (args.length < 1) {
      System.err.println("Usage: java SumDigits number");
      return;
    }

    String number = args[0];
    System.out.print("The sum of digits = ");
    int length = number.length()-1, sum = 0;

    for (int i=0; i<=length; i++) {
      char ch = number.charAt(i);
      System.out.print((i==length) ? ch : (ch + " + "));
      sum += ch-48;
    }
    System.out.println(" = " + sum);
  }
}
