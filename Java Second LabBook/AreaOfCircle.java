import java.util.Scanner;

public class AreaOfCircle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the radius: ");

    double radius = scanner.nextDouble();

    double area = Math.PI * (radius * radius);
    System.out.println("The Area of the Circle is: " + area);

    double circumference = 2*Math.PI*radius;
    System.out.println("The Circumference of the Circle is " + circumference);
  }
}
