import java.util.Scanner;

public class SphereComputation {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter the radius: ");
    double radius = reader.nextDouble();

    double volume = 4/3 * Math.PI * radius * radius * radius;
    double surfaceArea = 4 * Math.PI * radius * radius;

    System.out.printf("Surface Area: %.2f%n", surfaceArea);
    System.out.printf("Volume: %.2f%n", volume);
  }
}
