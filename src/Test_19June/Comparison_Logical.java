package Test_19June;

public class Comparison_Logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Comparison operators
        System.out.println("Comparison Operators:");
        System.out.println("a == b: " + (a == b));       // false
        System.out.println("a != b: " + (a != b));       // true
        System.out.println("a < b: " + (a < b));         // true
        System.out.println("a > b: " + (a > b));         // false
        System.out.println("a <= b: " + (a <= b));       // true
        System.out.println("a >= b: " + (a >= b));       // false

        // Logical operators
        boolean isAdult = true;
        boolean hasTicket = false;

        System.out.println("\nLogical Operators:");
        System.out.println("isAdult && hasTicket: " + (isAdult && hasTicket));  // false
        System.out.println("isAdult || hasTicket: " + (isAdult || hasTicket));  // true
        System.out.println("!isAdult: " + (!isAdult));                          // false

        // Combining comparison and logical operators
        System.out.println("\nCombined Comparison and Logical Example:");
        System.out.println("(a < b) && (b < 50): " + ((a < b) && (b < 50)));    // true
        System.out.println("(a > b) || (b == 20): " + ((a > b) || (b == 20)));  // true
    }
}

