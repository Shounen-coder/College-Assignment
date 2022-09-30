import java.util.Scanner;

class QuadraticFunctionCalculator {
  // Fields
  int coef_a;
  int coef_b;
  int coef_c;

  QuadraticFunctionCalculator() {
    coef_a = 1;
    coef_b = 1;
    coef_c = 1;
  }
  QuadraticFunctionCalculator(int a, int b, int c) {
    coef_a = a;
    coef_b = b;
    coef_c = c;
  }

  // Extractors
  public int get_a() {
    return this.coef_a;
  }
  public int get_b() {
    return this.coef_b;
  }
  public int get_c() {
    return this.coef_c;
  }

  // Modifier
  public void set_a(int val) {
    this.coef_a = val;
  }
  public void set_b(int val) {
    this.coef_b = val;
  }
  public void set_c(int val) {
    this.coef_c = val;
  }

  // Compute
  public int compute(int x) {
    return this.coef_a*x*x + this.coef_b*x + this.coef_c;
  }
}

public class QuadraticFunction {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.println("Quadratic Function class initialized with no parameters: ");
    QuadraticFunctionCalculator obj = new QuadraticFunctionCalculator();
    System.out.println("  a = " + obj.get_a());
    System.out.println("  b = " + obj.get_b());
    System.out.println("  c = " + obj.get_c());

    System.out.println("Quadratic Function class initialized with parameters: ");
    QuadraticFunctionCalculator obj2 = new QuadraticFunctionCalculator(4, 8, 9);
    System.out.println("  a = " + obj2.get_a());
    System.out.println("  b = " + obj2.get_b());
    System.out.println("  c = " + obj2.get_c());

    System.out.println("Changing coefficients using Modifiers: ");
    System.out.println("  Enter some new coefficient values for them: ");
    System.out.print("    a = ");
    obj.set_a(reader.nextInt());
    System.out.print("    b = ");
    obj.set_b(reader.nextInt());
    System.out.print("    c = ");
    obj.set_c(reader.nextInt());

    System.out.println("And printing their new values using Extractors: ");
    System.out.println("  obj.a = " + obj.get_a());
    System.out.println("  obj.b = " + obj.get_b());
    System.out.println("  obj.c = " + obj.get_c());

    System.out.println("Computing the Quadratic Equation: ");
    System.out.print("  Enter the value of x: ");
    int x = reader.nextInt();
    System.out.println("  obj(" + x + ") = " + obj.compute(x));
  }
}