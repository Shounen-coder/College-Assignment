#include<stdio.h>

int main() {
  int t1 = 0, t2 = 1, n;
  int next = t1 + t2;

  printf("Enter the number of terms: ");
  scanf("%d", &n);
  printf("Fibonacci Series: %d, %d, ", t1, t2);
  for (int i=3; i <= n; ++i) {
    printf("%d, ", next);
    t1 = t2;
    t2 = next;
    next = t1 + t2;
  }
  return 0;
}