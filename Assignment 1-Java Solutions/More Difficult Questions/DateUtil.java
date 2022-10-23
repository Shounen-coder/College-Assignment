public class DateUtil {
  private static String[] strMonths = {
    "Jan", "Feb", "Mar", "Apr", "May", "Jun",
    "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
  };
  private static String[] calendarDays = {
    "Sunday", "Monday", "Tuesday", "Wednesday",
    "Thursday", "Friday", "Saturday"
  };
  private static int[] daysInMonths = {
    31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
  };
  private static int[] monthTable = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
  private static int[] monthTableLeapYear = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
  private static int[] centuryTable = {6, 4, 2, 0};

  static boolean isLeapYear(int year) {
    return (year%400==0) || (year%4==0 && year%100!=0);
  }
  static boolean isValidDate(int day, int month, int year) {
    boolean validNoOfDays = ((month==2) && isLeapYear(year)) ? (day>=1 && day<=29) : (day>=1 && day<=daysInMonths[month-1]);
    return validNoOfDays && (month>=1 && month<=12) && (year>=1 && year<=9999);
  }
  static int getDayOfWeek(int day, int month, int year) {
    int last2DigitsOfYear = year%100;
    return (centuryTable[(year/100)%4] + last2DigitsOfYear +  last2DigitsOfYear/4 + (isLeapYear(year) ? monthTableLeapYear[month-1] : monthTable[month-1]) + day)%7;
  }
  static String toString(int day, int month, int year) {
    if (isValidDate(day, month, year))
      return calendarDays[getDayOfWeek(day, month, year)] + " " + day + " " + strMonths[month-1] + " " + year;
    return "The given date is not a valid Date";
  }
  public static void main(String[] args) {
    // isLeapYear
    System.out.println(isLeapYear(1900)); // false
    System.out.println(isLeapYear(2000)); // true
    System.out.println(isLeapYear(2011)); // false
    System.out.println(isLeapYear(2012)); // true

    System.out.println();

    // isValidDate
    System.out.println(isValidDate(29, 2, 2012)); // true
    System.out.println(isValidDate(29, 2, 2011)); // false
    System.out.println(isValidDate(31, 12, 2099)); // true
    System.out.println(isValidDate(32, 12, 2099)); // false

    System.out.println();

    // getDayOfWeek
    System.out.println(getDayOfWeek(24, 4, 1982)); // 6 (Sat)
    System.out.println(getDayOfWeek(1, 1, 2000)); // 6 (Sat)
    System.out.println(getDayOfWeek(19, 6, 2054)); // 5 (Fri)
    System.out.println(getDayOfWeek(17, 2, 2012)); // 5 (Fri)

    System.out.println();

    // toString
    System.out.println(toString(14, 2, 2012)); // Tuesday 14 Feb 2012
  }
}