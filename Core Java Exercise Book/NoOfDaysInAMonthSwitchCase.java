import java.util.Scanner;

public class NoOfDaysInAMonthSwitchCase {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter the number of month: ");
    int month = reader.nextInt();
    System.out.print("Enter the year: ");
    int year = reader.nextInt();

    switch (month) {
      case 1:
        System.out.println("No. of days in month " + month + " is " + 31);
        break;
      case 2:
        if (year%4==0 || year%400==0)
          System.out.println("No. of days in month " + month + " is " + 29);
        else
          System.out.println("No. of days in month " + month + " is " + 28);
        break;
      case 3:
        System.out.println("No. of days in month " + month + " is " + 31);
        break;
      case 4:
        System.out.println("No. of days in month " + month + " is " + 30);
        break;
      case 5:
        System.out.println("No. of days in month " + month + " is " + 31);
        break;
      case 6:
        System.out.println("No. of days in month " + month + " is " + 30);
        break;
      case 7:
        System.out.println("No. of days in month " + month + " is " + 31);
        break;
      case 8:
        System.out.println("No. of days in month " + month + " is " + 31);
        break;
      case 9:
        System.out.println("No. of days in month " + month + " is " + 30);
        break;
      case 10:
        System.out.println("No. of days in month " + month + " is " + 31);
        break;
      case 11:
        System.out.println("No. of days in month " + month + " is " + 30);
        break;
      case 12:
        System.out.println("No. of days in month " + month + " is " + 31);
        break;
      default:
        System.out.println("Invalid number for month: " + month);
        break;
    }
  }
}
