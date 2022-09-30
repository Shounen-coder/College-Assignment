public class DeclaringAndTypeCastingPrimitives {
  public static void main(String[] args) {
    // Variable Initialization Method 1
    int int1 = 1;
    char char1 = 'b';
    boolean boolean1 = true;
    float float1 = 12.34f;
    double double1 = 12.345678;
    byte byte1 = 12;
    short short1 = 100;
    long long1 = 100000000000000l;

    // Variable Declaration Method 2
    int int2;
    int2 = 1;
    char char2;
    char2 = 'j';
    boolean boolean2;
    boolean2 = true;
    float float2;
    float2 = 12.34f;
    double double2;
    double2 = 12.345678;
    byte byte2;
    byte2 = 12;
    short short2;
    short2 = 100;
    long long2;
    long2 = 100000000000000l;

    // The commented statements throws error (Type mismatch):

    // Implicit and Explicit Typecasting (int)
    int1 = char1;
    // int1 = boolean1;
    // int1 = float1;
    // int1 = double1;
    int1 = byte1;
    int1 = short1;
    // int1 = long1;

    int1 = (int) char1;
    // int1 = (int) boolean1;
    int1 = (int) float1;
    int1 = (int) double1;
    int1 = (int) byte1;
    int1 = (int) short1;
    int1 = (int) long1;

    // Implicit and Explicit Typecasting (char)
    // char1 = int1;
    // char1 = boolean1;
    // char1 = float1;
    // char1 = double1;
    // char1 = byte1;
    // char1 = short1;
    // char1 = long1;

    char1 = (char) int1;
    // char1 = (char) boolean1;
    char1 = (char) float1;
    char1 = (char) double1;
    char1 = (char) byte1;
    char1 = (char) short1;
    char1 = (char) long1;


    // Implicit and Explicit Typecasting (boolean)
    // boolean1 = int1;
    // boolean1 = char1;
    // boolean1 = float1;
    // boolean1 = double1;
    // boolean1 = byte1;
    // boolean1 = short1;
    // boolean1 = long1;

    // boolean1 = (boolean) int1;
    // boolean1 = (boolean) char1;
    // boolean1 = (boolean) float1;
    // boolean1 = (boolean) double1;
    // boolean1 = (boolean) byte1;
    // boolean1 = (boolean) short1;
    // boolean1 = (boolean) long1;

    // Implicit and Explicit Typecasting (double)
    double1 = int1;
    double1 = char1;
    // double1 = boolean1;
    double1 = float1;
    double1 = byte1;
    double1 = short1;
    double1 = long1;

    double1 = (double) int1;
    double1 = (double) char1;
    // double1 = (double) boolean1;
    double1 = (double) float1;
    double1 = (double) byte1;
    double1 = (double) short1;
    double1 = (double) long1;
    
    // Implicit and Explicit Typecasting (float)
    float1 = int1;
    float1 = char1;
    // float1 = boolean1;
    // float1 = double1;
    float1 = byte1;
    float1 = short1;
    float1 = long1;

    float1 = (float) int1;
    float1 = (float) char1;
    // float1 = (float) boolean1;
    float1 = (float) double1;
    float1 = (float) byte1;
    float1 = (float) short1;
    float1 = (float) long1;

    // Implicit and Explicit Typecasting (short)
    // short1 = int1;
    // short1 = char1;
    // short1 = boolean1;
    // short1 = double1;
    // short1 = float1;
    short1 = byte1;
    // short1 = long1;

    short1 = (short) int1;
    short1 = (short) char1;
    // short1 = (short) boolean1;
    short1 = (short) double1;
    short1 = (short) float1;
    short1 = (short) byte1;
    short1 = (short) long1;

    // Implicit and Explicit Typecasting (long)
    long1 = int1;
    long1 = char1;
    // long1 = boolean1;
    // long1 = double1;
    // long1 = float1;
    long1 = byte1;
    long1 = short1;

    long1 = (long) int1;
    long1 = (long) char1;
    // long1 = (long) boolean1;
    long1 = (long) double1;
    long1 = (long) float1;
    long1 = (long) byte1;
    long1 = (long) short1;

    // Implicit and Explicit Typecasting (byte)
    // byte1 = int1;
    // byte1 = char1;
    // byte1 = boolean1;
    // byte1 = double1;
    // byte1 = float1;
    // byte1 = short1;
    // byte1 = long1;

    byte1 = (byte) int1;
    byte1 = (byte) char1;
    // byte1 = (byte) boolean1;
    byte1 = (byte) double1;
    byte1 = (byte) float1;
    byte1 = (byte) short1;
    byte1 = (byte) long1;

  }
}
