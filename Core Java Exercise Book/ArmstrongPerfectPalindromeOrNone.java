import java.util.Scanner;

public class ArmstrongPerfectPalindromeOrNone {
  public static boolean isArmstrong(int num) {
    int temp = num, sum = 0, length = 0;
    while (temp!=0) {
      length++;
      temp = temp/10;
    }

    temp = num;
    while (temp!=0) {
      sum += (int) Math.pow(temp%10, length);
      temp = temp/10;
    }
    return sum == num;
  }
  public static boolean isPerfect(int num) {
    if (num < 1)
      return false;
    else if (num == 1)
      return true;

    int sum = 0;
    for (int i=1; i<=num/2; i++) {
      if (num%i==0)
        sum += i;
    }
    return sum == num;
  }
  public static boolean isPalindrome(int num) {
    int temp = num, num2 = 0;
    while (temp!=0) {
      num2 = (num2*10) + (temp%10);
      temp = temp/10;
    }
    return num2 == num;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = reader.nextInt();
    boolean armstrong = isArmstrong(num);
    boolean perfect = isPerfect(num);
    boolean palindrome = isPalindrome(num);

    if (armstrong)
      System.out.println(num + " is an Armstrong number");
    if (perfect)
      System.out.println(num + " is a Perfect number");
    if (palindrome)
      System.out.println(num + " is a Palindrome number");
    if (!armstrong && !perfect && !palindrome)
      System.out.println(num + " is not an Armstrong, neither Perfect nor Palindrome");
  }
}
