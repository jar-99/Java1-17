package java16;

import java.util.Scanner;

public class LinearEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coefficients a and b: ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();

        float solution = solveLinearEquation(a, b);

        System.out.printf("Solution: %.2f%n", solution);
    }

    public static float solveLinearEquation(float a, float b) {
        if (a == 0) {
            System.out.println("No unique solution. 'a' should not be zero.");
            return Float.NaN;
        }

        float solution = -b / a;
        return solution;
    }
}