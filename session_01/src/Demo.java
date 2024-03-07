
public class Demo {
    public static void main(String[] args) {
        System.out.println("Default values for primitive data types:");
        System.out.println("byte: " + Byte.MIN_VALUE);
        System.out.println("short: " + Short.MIN_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE);
        System.out.println("long: " + Long.MIN_VALUE);
        System.out.println("float: " + Float.MIN_VALUE);
        System.out.println("double: " + Double.MIN_VALUE);
        System.out.println("char: " + (int) Character.MIN_VALUE); // Cast to int to print as number
        System.out.println("boolean: " + false);

        System.out.println("\nDefault value for reference data types:");
        System.out.println("Object: " + null);
    }
}

