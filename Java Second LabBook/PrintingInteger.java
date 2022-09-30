// Java program to print Integers

import java.util.Scanner;

public class PrintingInteger {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in); 
    System.out.print("Enter a number: "); 
    int number = reader.nextInt(); 
    System.out.println("You entered: " + number); 
  }
}