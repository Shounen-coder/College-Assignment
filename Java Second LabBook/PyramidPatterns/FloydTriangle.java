import java.util.Scanner;

public class FloydTriangle {
  public static void main(String[] args) {
    int number = 1;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of rows for Floyd's Triangle: ");
    int rows = input.nextInt();
    System.out.println("Floyd's triangle: ");

    for (int counter = 1; counter <= rows; counter++) {
      for (int j=1; j <= counter; j++) {
        System.out.print(number + " ");
        number++;
      }
      System.out.println();
    }
  }
}
