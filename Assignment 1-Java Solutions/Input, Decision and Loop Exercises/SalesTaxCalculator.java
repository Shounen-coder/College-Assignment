import java.util.Scanner;

public class SalesTaxCalculator {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    final double SALES_TAX_RATE = 0.07;
    final int SENTINEL = -1;
    double price, actualPrice, salesTax; 
    double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0; 

    while (true) {
      System.out.print("Enter the Tax-inclusive price in Dollars (or " + SENTINEL + " to end): ");
      price = reader.nextDouble();

      if (price == SENTINEL) {
        totalPrice = totalActualPrice + totalSalesTax;
        System.out.printf("Total Price is: $%.2f%n", totalPrice);
        System.out.printf("Total Actual Price is: $%.2f%n", totalActualPrice);
        System.out.printf("Total Salse Tax is: $%.2f%n", totalSalesTax);
        break;
      }

      actualPrice = price/(1+SALES_TAX_RATE);
      salesTax = price - actualPrice;
      System.out.printf("Actual Price is: $%.2f, Sales Tax is: $%.2f%n", actualPrice, salesTax);
      totalActualPrice += actualPrice;
      totalSalesTax += salesTax;
    }
  }
}
