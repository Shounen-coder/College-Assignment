public class Product1ToN {
  public static long factorial(int num) {
    long result = 1;
    for (int i=1;i<=num; i++)
      result *= i;
    return result;
  }  
  public static void main(String[] args) {
    System.out.println("Factorial of 10 is: " + factorial(10));
    System.out.println("Factorial of 11 is: " + factorial(11));
    System.out.println("Factorial of 12 is: " + factorial(12));
    System.out.println("Factorial of 13 is: " + factorial(13));
    System.out.println("Factorial of 14 is: " + factorial(14));
  }
}
