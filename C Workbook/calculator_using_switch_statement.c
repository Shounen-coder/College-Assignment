#include <stdio.h>
int main() {
  char operator;
  double num1, num2;

  printf("Enter two operands: ");
  scanf("%lf %lf", &num1, &num2);
  printf("Enter an operator (+, -, *, /): ");
  scanf("%c", &operator);

  switch(operator) {
    case '+':
      printf("%.1lf + %.1lf = %.1lf",num1, num2, num1+num2);
      break;
    case '-':
      printf("%.1lf - %.1lf = %.1lf",num1, num2, num1-num2);
      break;
    case '*':
      printf("%.1lf * %.1lf = %.1lf",num1, num2, num1*num2);
      break;
    case '/':
      printf("%.1lf / %.1lf = %.1lf",num1, num2, num1/num2);
      break;
    default:
      printf("Unknown operator: %c", operator);
  }
  return 0;
}