import java.util.Scanner;

public class Add2Integers {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int sum = 0;
    System.out.print("Enter 2 integer: ");
    for (int i=0; i<2; i++)
      sum += scan.nextInt();
    System.out.println("Sum = "+ sum);
  }
}
