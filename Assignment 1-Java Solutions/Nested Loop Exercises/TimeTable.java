import java.util.Scanner;

public class TimeTable {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Enter the size: ");
    int size = reader.nextInt();

    System.out.print("    * |");
    for (int i=1; i<=size; i++) // header
      System.out.printf("%4d", i);
    System.out.println();

    for (int i=1; i<=size; i++) // separator
      System.out.print("-----");
    System.out.println();

    for (int row=1; row <= size; row++) { // content
      System.out.printf(" %4d |", row);
      for (int col=1; col <= size; col++)
        System.out.printf("%4d", row*col);
      System.out.println();
    }
  }  
}