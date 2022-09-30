protected class base { // Error: illegal modifier for class - 'protected'
  String Method() {
    return "Wow";
  }
}
class derived {
  public void useD() {
    base z = new base();
    System.out.println("base says, " + z.Method());
  }
}

public class CompileAndSeeWhatHappens {
  public static void main(String[] args) {
    derived obj = new derived();
    obj.useD();
  }
}