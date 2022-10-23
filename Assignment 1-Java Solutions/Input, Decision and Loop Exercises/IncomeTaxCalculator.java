import java.util.Scanner;

public class IncomeTaxCalculator {
  public static void calculateIncomeTaxAmount(int taxableIncome, int rebatePercentage, int rebateCap) {
    final double TAX_RATE_ABOVE_20K = 0.1;
    final double TAX_RATE_ABOVE_40K = 0.2;
    final double TAX_RATE_ABOVE_60K = 0.3;

    double taxPayable;
    if (taxableIncome > 60000)
      taxPayable = 20000*TAX_RATE_ABOVE_20K + 20000*TAX_RATE_ABOVE_40K + (taxableIncome-60000)*TAX_RATE_ABOVE_60K;
    else if (taxableIncome > 40000)
      taxPayable = 20000*TAX_RATE_ABOVE_20K + (taxableIncome-40000)*TAX_RATE_ABOVE_40K;
    else if (taxableIncome > 20000)
      taxPayable = (taxableIncome-20000)*TAX_RATE_ABOVE_20K;
    else
      taxPayable = 0;

    if ((rebatePercentage > 0) && (rebateCap > 0)) {
      double discountAmount = taxPayable/rebatePercentage;
      if (discountAmount <= rebateCap)
        taxPayable -= discountAmount;
    }

    System.out.printf("The Income Tax payable is: $%.2f%n", taxPayable);
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int rebatePercentage = 0, rebateCap = 0, taxableIncome = 0;
    final int SENTINEL = -1;

    while (true) {
      System.out.print("Enter the taxable income (or " + SENTINEL + " to end): ");
      taxableIncome = reader.nextInt();
      if (taxableIncome == SENTINEL)
        break;
      calculateIncomeTaxAmount(taxableIncome, rebatePercentage, rebateCap);
    }
    System.out.println("bye");
  }
}
