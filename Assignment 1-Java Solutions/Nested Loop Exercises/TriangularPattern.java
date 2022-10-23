import java.util.Scanner;

public class TriangularPattern {
  public static void patternA(int size) {
    System.out.println("Pattern A:");
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size+1; col++) { // A
        if (row >= col)
          System.out.print("# ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void patternB(int size) {
    System.out.println("Pattern B:");
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size+1; col++) { // B
        if (row + col <= size + 1)
          System.out.print("# ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void patternC(int size) {
    System.out.println("Pattern C:");
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) { // C
        if (row <= col)
          System.out.print("# ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void patternD(int size) {
    System.out.println("Pattern D:");
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size+1; col++) { // D
        if (row + col >= size + 2)
          System.out.print("# ");
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
