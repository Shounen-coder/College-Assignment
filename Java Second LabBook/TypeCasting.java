// Java code for Typecasting

public class TypeCasting {
  public static void main(String[] args) {
    byte a = 10; 
    int i = a;
    // byte c = i; // Returns Error
    byte d = (byte) i;

    byte x = 10;
    byte y = 20;

    byte sum = x*y; // Returns Error as well
  }
}
