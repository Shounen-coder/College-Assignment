class Demo {
  protected int a = 1;
  protected int b = 2;
}

public class ManipulatingProtectedData {
  public static void change_data(Demo obj) {
    obj.a = 3;
    obj.b = 4;
  }
  public static void main(String[] args) {
    Demo obj = new Demo();
    change_data(obj); // Data in the Demo class gets changed here
    System.out.println("obj.a = " + obj.a);
    System.out.println("obj.b = " + obj.b);
  }
}
