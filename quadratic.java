import java.util.Scanner;

class QuadraticEquationSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();

        for (int i = 0; i < numTestCases; i++) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            if (a == 0) {
                System.out.println("Invalid input: 'a' cannot be zero.");
            } else {
                findAndPrintRoots(a, b, c);
            }
        }
    }

    private static void findAndPrintRoots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        double sqrtDiscriminant = Math.sqrt(Math.abs(discriminant));

        if (discriminant > 0) {
            double root1 = (-b + sqrtDiscriminant) / (2 * a);
            double root2 = (-b - sqrtDiscriminant) / (2 * a);
            System.out.printf("%2.2f %2.2f\n", root1, root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("%2.2f %2.2f\n", root, root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = sqrtDiscriminant / (2 * a);
            System.out.printf("%2.2f+%2.2fi %2.2f-%2.2fi\n", realPart, imaginaryPart, realPart, imaginaryPart);
        }
    }
}