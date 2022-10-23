import java.util.Scanner;

public class PrintArray {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int[] items;

    System.out.print("Enter the number of items: ");
    final int NUM_ITEMS = reader.nextInt();
    items = new int[NUM_ITEMS];

    System.out.print("Enter the value of all items (separated by space): ");
    for (int i=0; i<NUM_ITEMS; i++)
      items[i] = reader.nextInt();

    System.out.print("The values are: [");
    for (int i=0; i<NUM_ITEMS; i++)
      System.out.print((i==0) ? items[i]: ", " + items[i]);
    System.out.println("]");
  }
}
