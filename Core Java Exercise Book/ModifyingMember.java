public class ModifyingMember {
  static final int temp = 0;
  static int num2;

  public ModifyingMember(int num) {
    num2 = num;
  }

  public void accessNonStaticMember() {
    int i = temp;
    System.out.println("Value of static member, accessed from a non-static method: " + i);
  }
  public static void main(String[] args) {
    // ModifyingMember modifyingMember = new ModifyingMember(); // returns error
    System.out.println("Cannot instantiate a class with one parameter with no parameters in the constructor");
    ModifyingMember modifyingMember = new ModifyingMember(2);
    modifyingMember.accessNonStaticMember();

    // temp = 1; // Constant member cannot be changed, returns error
    System.out.println("Constant member cannot be changed");
  }
}