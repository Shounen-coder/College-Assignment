import java.util.Scanner;

public class BoxPattern {
  public static void patternA(int size) {
    System.out.println("Pattern A:");
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) { // A
        if (row == 1 || row == size || col == 1 || col == size)
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
      for (int col = 1; col <= size; col++) { // B
        if (row==1 || row==size || row==col)
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
        if (row==1 || row==size || row+col==size+1)
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
      for (int col = 1; col <= size; col++) { // D
        if (row==1 || row==size || row+col==size+1 || row==col)
          System.out.print("# ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void patternE(int size) {
    System.out.println("Pattern E:");
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) { // E
        if (row==1 || row==size || col == 1 || col == size || row+col==size+1 || row==col)
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
    patternE(size);
  }
}
