import java.util.Scanner;

public class CircleComputation {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter the radius: ");
    double radius = reader.nextDouble();

    double diameter = 2.0 * radius;
    double circumference = 2.0  * Math.PI * radius;
    double area = Math.PI * radius * radius;

    System.out.printf("Diameter: %.2f%n", diameter);
    System.out.printf("Area: %.2f%n", area);
    System.out.printf("Circumference: %.2f%n", circumference);
  }
}
