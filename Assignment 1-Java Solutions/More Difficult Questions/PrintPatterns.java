import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;
import javax.xml.transform.Source;

public class PrintPatterns {
  public static void printPatternA(int size, int numCol) {
    System.out.println("Pattern A:");
    for (int row=1; row <= size; row++) {
      for (int col=1; col <= numCol; col++) { // B
        if ((row <= col) && (row <= numCol-col+1) && (row <= size))
          System.out.print("# ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void printPatternB(int size, int numCol) {
    System.out.println("Pattern B:");
    for (int row=1; row <= size; row++) {
      for (int col=1; col <= numCol; col++) { // A
        if ((row+col >= size+1) && (row >= col-size+1) && (row <= size))
          System.out.print("# ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void printPatternC(int size, int numCol) {
    System.out.println("Pattern C:");
    for (int row=1; row <= numCol; row++) {
      for (int col=1; col <= numCol; col++) { // C
        if (((row+col >= size+1) && (row >= col-size+1) && (row <= size)) || ((row > size) && (numCol-col+1>row-size) && (row-size<col)))
          System.out.print("# ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void printPatternD(int size) {
    System.out.println("Pattern D:");
    for (int row=1; row <= size; row++) {
      for (int col=1; col <= size; col++)
        System.out.print(((col<=row) ? col : " ") + " ");
      System.out.println();
    }
    System.out.println();
  }
  public static void printPatternE(int size) {
    System.out.println("Pattern E:");
    for (int row=1; row <= size; row++) {
      for (int col=1; col <= size; col++)
        System.out.print(((col>=row) ? col-row+1 : " ") + " ");
      System.out.println();
    }
    System.out.println();
  }
  public static void printPatternF(int size) {
    int val;
    System.out.println("Pattern F:");
    for (int row=1; row <= size; row++) {
      for (int col=1; col <= size; col++) {
        val = size-col+1;
        System.out.print(((val<=row) ? val : " ") + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void printPatternG(int size) {
    System.out.println("Pattern G:");
    for (int row=size; row >= 1; row--) {
      for (int col=row; col >= 1; col--)
        System.out.print(col + " ");
      System.out.println();
    }
    System.out.println();
  }
  public static void printPatternH(int size) {
    System.out.println("Pattern H:");
    for (int row=0; row < size; row++) {
      for (int j=0; j < size-row-1; j++)
        System.out.print("  ");

      for (int j=1; j <= row; j++)
        System.out.print(j + " ");

      for (int j=row+1; j>=1; j--)
        System.out.print(j + " ");
      System.out.println();
    }
    System.out.println();
  }
  public static void printPatternI(int size) {
    System.out.println("Pattern I:");
    for (int row=0; row < size; row++) {
      for (int j=0; j <= row; j++)
        System.out.print("  ");

      for (int j=1; j < size-row; j++)
        System.out.print(j + " ");

      for (int j=size-row; j>=1; j--)
        System.out.print(j + " ");
      System.out.println();
    }
    System.out.println();
  }
  public static void printPatternJ(int size, int numCol) {
    System.out.println("Pattern J:");
    for (int row=1; row <= size; row++) {
      for (int col=1; col <= numCol; col++)
      if (col<=row || numCol-col+1<=row)
        System.out.print(((col>size) ? numCol-col+1 : col) + " ");
      else
        System.out.print("  ");

      System.out.println();
    }
    System.out.println();
  }
  public static void printPatternK(int size, int numCol) {
    System.out.println("Pattern K:");
    for (int row=1; row <= size; row++) {
      for (int col=1; col <= numCol; col++)
      if (size-row+1>=col || col-size+1>=row)
        System.out.print(((col>size) ? numCol-col+1 : col) + " ");
      else
        System.out.print("  ");

      System.out.println();
    }
    System.out.println();
  }
  public static void printPatternL(int size, int numCol) {
    System.out.println("Pattern L:");
    for (int row=1; row <= size; row++) {
      for (int j=1; j <= size-row; j++)
        System.out.print("  ");

      for (int j=row; j<=2*row-1; j++)
        System.out.print(j%10 + " ");

      for (int j=2*row-2; j>=row; j--)
        System.out.print(j%10 + " ");

      System.out.println();
    }
    System.out.println();
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Enter the size: ");
    int size = reader.nextInt();
    int numCol = 2*size - 1;

    printPatternA(size, numCol);
    printPatternB(size, numCol);
    printPatternC(size, numCol);
    printPatternD(size);
    printPatternE(size);
    printPatternF(size);
    printPatternG(size);
    printPatternH(size);
    printPatternI(size);
    printPatternJ(size, numCol);
    printPatternK(size, numCol);
    printPatternL(size, numCol);
  }
}
