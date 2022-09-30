import java.util.Scanner;

public class AreaOfTriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the width of the Triangle: ");
    double base = scanner.nextDouble();

    System.out.print("Enter the height of the Triangle:");
    double height = scanner.nextDouble();

    double area = (base* height)/2;
    System.out.println("Area of Triangle is " + area);
  }
}
