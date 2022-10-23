public class Factorial {
  public static void main(String[] args) {
    int n = 20;
    long factorial = 1;

    for (int i=1; i <= n; i++) {
      factorial = factorial * i;
    }
    /*
     * The cod breaks when the 'i' value is 18. It holds value until the 17th
     * factorial (=2004189184) in the int datatype. But at the 18th
     * iteration, the value changes to -288522240. So, in order to correct
     * this code, the variable "factorial" should be a long datatype
     */
    System.out.println("The Factorial of " + n + " is " + factorial);
  }
}
