import java.util.Scanner;

public class NumBerPattern {
  public static void patternA(int size) {
    System.out.println("Pattern A:");
    for (int row=1; row<=size; row++) {
      for (int col=1; col<=size; col++) { // A
        if (row >= col)
          System.out.print(col + " ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void patternB(int size) {
    System.out.println("Pattern B:");
    for (int row=1; row<=size; row++) {
      for (int col=1; col<=size; col++) { // B
        if (row <= col)
          System.out.print(col + " ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void patternC(int size) {
    System.out.println("Pattern C:");
    for (int row=1; row<=size; row++) {
      for (int col=1; col<=size; col++) { // C
        if (size-col+1<=row)
          System.out.print(size-col+1 + " ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void patternD(int size) {
    System.out.println("Pattern D:");
    for (int row=1; row<=size; row++) {
      for (int col=1; col<=size; col++) { // D
        if (size-col+1>=row)
          System.out.print(size-col+1 + " ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Enter the size: ");
    int size = reader.nextInt();

    patternA(size);
    patternB(size);
    patternC(size);
    patternD(size);
  }
}
