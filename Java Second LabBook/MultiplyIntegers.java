// Java code for multiplying 2 Integers given by user

import java.util.Scanner;

public class MultiplyIntegers {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter an Integer: ");
    int i = reader.nextInt();

    System.out.print("Enter an another Integer: ");
    int j = reader.nextInt();
    int mul = i*j;
    System.out.println(i + " * " + j + " = " + mul);
  }
}
