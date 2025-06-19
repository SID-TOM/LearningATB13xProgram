import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input: three side lengths
    System.out.print("Enter length of side a: ");
    double a = scanner.nextDouble();

    System.out.print("Enter length of side b: ");
    double b = scanner.nextDouble();

    System.out.print("Enter length of side c: ");
    double c = scanner.nextDouble();

    // Check if it's a valid triangle using the triangle inequality theorem
    if (a + b > c && a + c > b && b + c > a) {
        // Classify the triangle
        if (a == b && b == c) {
            System.out.println("The triangle is equilateral.");
        } else if (a == b || b == c || a == c) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }
    } else {
        System.out.println("The given side lengths do not form a valid triangle.");
    }

    scanner.close();
}
}

