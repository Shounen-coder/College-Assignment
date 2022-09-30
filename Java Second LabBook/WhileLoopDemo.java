import java.util.Scanner;

public class WhileLoopDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter any Integer value below 10: ");

    int number = sc.nextInt(), sum = 0;
    while (number <= 10) { 
      sum = sum + number;
      number++;
    } 
    System.out.format("Sum of Numbers from the 1 to %d is: %d", number, sum);
  }
}
