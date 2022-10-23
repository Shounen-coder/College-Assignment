import java.util.Scanner;

public class SumProductMinMax {
  public static void 3values() {
    int number1, number2, number3, product, min, max, sum, product;
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter 1st Integer: ");
    number1 = reader.nextInt();
    System.out.print("Enter 2nd Integer: ");
    number2 = reader.nextInt();
    System.out.print("Enter 3rd Integer: ");
    number3 = reader.nextInt();

    sum = number1 + number2 + number3;
    product = number1 * number2 * number3;

    System.out.println("Sum: " + sum);
    System.out.println("Product: " + product);

    System.out.print("The min is: ");
    if (number1 >= number2 && number1 >= number3)
      System.out.println(number1);
    else if (number2 >= number1 && number2 >= number3)
      System.out.println(number2);
    else if (number3 >= number1 && number3 >= number2)
      System.out.println(number3);

    System.out.print("The max is: ");
    if (number1 < number2 && number1 < number3)
      System.out.println(number1);
    else if (number2 < number1 && number2 < number3)
      System.out.println(number2);
    else if (number3 < number1 && number3 < number2)
      System.out.println(number3);   
  }
  public static void 5values() {
    int number1, number2, number3, number4, number5, product, min, max, sum, product;
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter 1st Integer: ");
    number1 = reader.nextInt();
    System.out.print("Enter 2nd Integer: ");
    number2 = reader.nextInt();
    System.out.print("Enter 3rd Integer: ");
    number3 = reader.nextInt();
    System.out.print("Enter 4th Integer: ");
    number4 = reader.nextInt();
    System.out.print("Enter 5th Integer: ");
    number5 = reader.nextInt();

    sum = number1 + number2 + number3 + number4 + number5;
    product = number1 * number2 * number3 * number4 * number5;

    System.out.println("Sum: " + sum);
    System.out.println("Product: " + product);

    System.out.print("The min is: ");
    if (number1 >= number2 && number1 >= number3 && number1 >= number4 && number1 >= number5)
      System.out.println(number1);
    else if (number2 >= number1 && number2 >= number3 && number2 >= number4 && number2 >= number5)
      System.out.println(number2);
    else if (number3 >= number1 && number3 >= number2 && number3 >= number4 && number3 >= number5)
      System.out.println(number3);
    else if (number4 >= number1 && number4 >= number2 && number4 >= number3 && number4 >= number5)
      System.out.println(number4);
    else if (number5 >= number1 && number5 >= number2 && number5 >= number3 && number5 >= number4)
      System.out.println(number5);

    System.out.print("The max is: ");
    if (number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5)
      System.out.println(number1);
    else if (number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5)
      System.out.println(number2);
    else if (number3 < number1 && number3 < number2 && number3 < number4 && number3 < number5)
      System.out.println(number3);
    else if (number4 < number1 && number4 < number2 && number4 < number3 && number4 < number5)
      System.out.println(number4);
    else if (number5 < number1 && number5 < number2 && number5 < number3 && number5 < number4)
      System.out.println(number5);
  }
  public static void main(String[] args) {
    System.out.println("SumProductMinMax for 3 Integers: ");
    3values();
    System.out.println("SumProductMinMax for 5 Integers: ");
    5values();
  }
}
