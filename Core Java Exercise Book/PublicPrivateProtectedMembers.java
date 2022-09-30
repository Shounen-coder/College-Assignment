class Demo {
  public int a = 1;
  private int b = 2;
  protected int c = 3;
  int d = 4;

  public void method_a() {
    System.out.println("Public method");
  }
  private void method_b() {
    System.out.println("Private method");
  }
  protected void method_c() {
    System.out.println("Protected method");
  }
  void method_d() {
    System.out.println("Default method");
  }
}

public class PublicPrivateProtectedMembers {
  public static void main(String[] args) {
    Demo obj = new Demo();
    System.out.println("Public variable: " + obj.a);
    // System.out.println("Private variable: " + obj.b); // throws error (variable not visible)
    System.out.println("Protected variable: " + obj.c);
    System.out.println("Default variable: " + obj.d);

    obj.method_a();
    // obj.method_b(); // throws error (method not visible)
    obj.method_c();
    obj.method_d();
  }
}
