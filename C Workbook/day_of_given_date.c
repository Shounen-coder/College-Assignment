#include<stdio.h>
#include<math.h>

int fm(int date, int month, int year) {
  int fmonth, leap;
  if ((year % 100 == 0) && (year % 400 != 0))
    leap = 0;
  else if (year % 4 == 0)
    leap = 1;
  else
    leap = 0;
  fmonth = 3 + (2 - leap) * ((month + 2) / (2 * month)) + (5 * month + month / 9) / 2;
  fmonth = fmonth % 7;
  return fmonth;
}

int day_of_week(int date, int month, int year) {
  int dayOfWeek;
  int YY = year % 100;
  int century = year / 100;
  printf("\nDate: %d/%d/%d \n", date, month, year);
  dayOfWeek = 1.25 * YY + fm(date, month, year) + date - 2 * (century % 4);
  dayOfWeek = dayOfWeek % 7;
  switch (dayOfWeek) {
    case 0:
      printf("Weekday = Saturday");
      break;
    case 1:
      printf("Weekday = Sunday");
      break;
    case 2:
      printf("Weekday = Monday");
      break;
    case 3:
      printf("Weekday = Tuesday");
      break;
    case 4:
      printf("Weekday = Wednesday");
      break;
    case 5:
      printf("Weekday = Thursday");
      break;
    case 6:
      printf("Weekday = Friday");
      break;
    default:
      printf("Incorrect data");
  }
  return 0;
}

void main() {
  int date, month, year;
  printf("Enter the year: ");
  scanf("%d", &year);
  printf("Enter the month: ");
  scanf("%d", &month);
  printf("Enter the date: ");
  scanf("%d", &date);
  day_of_week(date, month, year);
}