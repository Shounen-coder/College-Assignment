public class ExtractDigits {
  public static void main(String[] args) {
    int number = 12345;
    while(number > 0) {
      System.out.print(number % 10 + " ");
      number /= 10;
    }
  }
}
