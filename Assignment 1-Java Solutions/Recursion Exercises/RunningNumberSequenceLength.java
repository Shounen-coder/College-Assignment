import java.util.Scanner;

public class RunningNumberSequenceLength {
  public static int numOfDigits(int n) {
    int count = 0;
    while (n!=0) {
      n /= 10;
      count++;
    }
    return count;
  }
  public static int len(int n) {
    if (n==1)
      return 1;
    return len(n-1) + numOfDigits(n);
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Enter an Integer: ");
    int number = reader.nextInt();
    System.out.println("The Length of Running Number Sequence of number " + number + " is: " + len(number));
  }
}