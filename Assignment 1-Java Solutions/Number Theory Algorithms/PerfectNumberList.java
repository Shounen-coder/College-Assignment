import java.util.Scanner;

public class PerfectNumberList {
  public static boolean isPerfect(int num) {
    int sum = 0;
    for (int i=1; i<=num/2; i++) {
      if (num%i==0)
        sum += i;
    }
    return sum==num;
  }
  public static boolean isDeficient(int num) {
    int sum = 0;
    for (int i=1; i<=num/2; i++) {
      if (num%i==0)
        sum += i;
    }
    return sum < num;
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    boolean isperfect;

    System.out.print("Enter the upper bound: ");
    int upperBound = reader.nextInt();

    int[] neitherPerfectNorDeficient = new int[upperBound];
    int perfectCount = 0, index = 0;

    System.out.println("These numbers are perfect:");
    for (int i=2; i<upperBound; i++) {
      isperfect = isPerfect(i);
      if (isperfect) {
        System.out.print(i + " ");
        perfectCount++;
      }
      else if (!isperfect && !isDeficient(i)) {
        neitherPerfectNorDeficient[index] = i;
        index++;
      }
    }

    System.out.printf("%n[%d perfect numbers found (%.2f%%)]%n", perfectCount, (perfectCount*100.0/upperBound));

    System.out.println("\nThese numbers are neither deficient nor perfect:");
    for (int i=0; i<index; i++)
      System.out.print(neitherPerfectNorDeficient[i] + " ");
    System.out.printf("%n[%d numbers found (%.2f%%)]%n", index-1, ((index-1)*100.0/upperBound));
  }
}