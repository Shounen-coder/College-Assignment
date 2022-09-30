#include <stdio.h>

int main() {
  int num; // Integer I/O
  printf("Enter an integer: ");
  scanf("%d", &num);
  printf("Number = %d\n", num);
  

  float num1; // Float I/O
  printf("Enter a number: ");
  scanf("%f", &num1);
  printf("num1 = %f\n", num1);

  double num2; // Double I/O
  printf("Enter a number: ");
  scanf("%lf", &num2);
  printf("num2 = %lf\n", num2);

  char ch; // Character I/O
  printf("Enter a character: ");
  scanf("%c", &ch);
  printf("You entered %c\n", ch);

  char chr; // ASCII I/O
  printf("Enter a character: ");
  scanf("%c", &chr);
  printf("You entered %c\n",chr);
  // When %d is used, ASCII value is displayed
  printf("ASCII value is %d\n", chr);

  int a; // Multiple I/O values
  float b;
  printf("Enter an Integer and a Float: ");
  scanf("%d%f", &a, &b);
  printf("You entered %d and %f\n", a, b);
}