import java.util.Scanner;

public class CylinderComputation {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter the radius: ");
    double radius = reader.nextDouble();

    System.out.print("Enter the height: ");
    double height = reader.nextDouble();

    double baseArea = Math.PI * radius * radius;
    double surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
    double volume = baseArea * height;

    System.out.printf("Base Area: %.2f%n", baseArea);
    System.out.printf("Surface Area: %.2f%n", surfaceArea);
    System.out.printf("Volume: %.2f%n", volume);
  }
}
