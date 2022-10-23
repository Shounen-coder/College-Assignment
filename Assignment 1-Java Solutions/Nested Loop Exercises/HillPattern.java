import java.util.Scanner;

public class HillPattern {
  public static void patternA(int numCol, int size) {
    System.out.println("Pattern A:");
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= numCol; col++) { // A
        if ((row+col >= size+1) && (row >= col-size+1) && (row <= size))
          System.out.print("# ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void patternB(int numCol, int size) {
    System.out.println("Pattern B:");
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= numCol; col++) { // B
        if ((row <= col) && (row <= numCol-col+1) && (row <= size))
          System.out.print("# ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void patternC(int numRows, int numCol, int size) {
    System.out.println("Pattern C:");
    for (int row = 1; row <= numRows; row++) {
      for (int col = 1; col <= numCol; col++) { // C
        if (((row+col >= size+1) && (row >= col-size+1) && (row <= size)) || ((row > size) && (numCol-col+1>row-size) && (row-size<col)))
          System.out.print("# ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void patternD(int numRows, int numCol, int size) {
    System.out.println("Pattern D:");
    for (int row = 1; row <= numRows; row++) {
      for (int col = 1; col <= numCol; col++) { // D
        if (((row <= size) && ((col<=size-row+1) || (col>=size+row-1))) || ((row > size) && ((row-size>=col-1) || (row-size>=numCol-col))))
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

    int numCol = 2*size - 1;
    int numRows = numCol;

    patternA(numCol, size);
    patternB(numCol, size);
    patternC(numRows, numCol, size);
    patternD(numRows, numCol, size);
  }
}
