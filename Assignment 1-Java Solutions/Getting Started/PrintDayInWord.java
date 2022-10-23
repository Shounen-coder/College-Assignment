import java.util.Scanner;

public class PrintDayInWord {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a day number: ");
    int dayNumber = reader.nextInt();

    System.out.print("If-else output:\nToday is ");
    if (dayNumber==0)
      System.out.println("Sunday");
    else if (dayNumber==1)
      System.out.println("Monday");
    else if (dayNumber==2)
      System.out.println("Tuesday");
    else if (dayNumber==3)
      System.out.println("Wednesday");
    else if (dayNumber==4)
      System.out.println("Thursday");
    else if (dayNumber==5)
      System.out.println("Friday");
    else if (dayNumber==6)
      System.out.println("Saturday");
    else
      System.out.println("Not a valid day");

    System.out.print("Switch-case output:\nToday is ");
    switch (dayNumber) {
      case 0:
        System.out.println("Sunday");
        break;
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("Not a valid day");
    }
  }
}