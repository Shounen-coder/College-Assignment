import java.util.Scanner;

public class ReversingNumber {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int num = 0, reversenum = 0;

    System.out.print("Enter a number: ");
    num = reader.nextInt();
    while (num != 0) {
      reversenum = reversenum * 10;
      reversenum = reversenum + num%10;
      num = num/10;
    }
    System.out.println("Reverse of number " + num + " is: " + reversenum);
  }
}
