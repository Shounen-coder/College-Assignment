import java.util.Scanner;

public class PrintTriangles {
  public static long factorial(int num) {
    if (num==0)
      return 1;
    int value = 1;
    for (int i=1; i<=num; i++)
      value *= i;
    return value;
  }
  public static void printPowersof2Triangle(int size) {
    System.out.println("Powers of 2 Triangle:");
    for (int row=1; row<=size; row++) {
      for (int i=0; i<=2*(size-row)+1; i++)
        System.out.print("  ");

      for (int i=0; i<=row-1; i++)
        System.out.printf("%3d ", (int) (Math.pow(2, i)));

      for (int i=row-2; i>=0; i--)
        System.out.printf("%3d ", (int) (Math.pow(2, i)));
      
      System.out.println();
    }
    System.out.println();
  }
  public static void printPascalTriangle1(int size) {
    System.out.println("Pascal Triangle (Method 1):");
    for (int i=0; i<=size; i++) {
      for (int j=0; j<=i; j++)
        System.out.printf("%-2d ", (long) (factorial(i)/(factorial(i-j)*factorial(j))));
      System.out.println();
    }
    System.out.println();
  }
  public static void printPascalTriangle2(int size) {
    System.out.println("Pascal Triangle (Method 2):");
    for (int i=0; i<=size; i++) {
      for (int j=0; j<=size-i; j++)
        System.out.print("  ");

      for (int j=0; j<=i; j++)
        System.out.printf(" %3d", (long) (factorial(i)/(factorial(i-j)*factorial(j))));
      System.out.println();
    }
    System.out.println();    
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter the size: ");
    int size = reader.nextInt();

    printPowersof2Triangle(size);
    printPascalTriangle1(size);
    printPascalTriangle2(size);
  }
}
