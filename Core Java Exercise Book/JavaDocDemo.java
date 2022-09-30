import java.util.Scanner;

/**
 * JavaDocDemo.java
 * This code is a demo file for JavaDoc
 * @author Jaasim
 */
public class JavaDocDemo {
  /**
   * This is the main method which is very important for 
   * execution for a java program
   * @param args Command-line arguments
   */
  public static void main(String[] args) {
    /**
      * This code gets 2 Integer inputs from user and displays its sum
     */
    Scanner reader = new Scanner(System.in);
    /**
      * Declared two variables x and y & taking input from the user
      * by using Scanner class
      */

      int x = reader.nextInt();
      int y = reader.nextInt();
      /**
      * Storing the result in variable sum which is of the integer type
      */
      int sum = x + y;
      /**
      * Using standard output stream for giving the output
      */
      System.out.println("Sum is: " + sum);
  }
}