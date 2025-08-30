package newProject;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the elements of the first 2x2 matrix:");
		double a11 = scanner.nextDouble();
		double a12 = scanner.nextDouble();
		double a21 = scanner.nextDouble();
		double a22 = scanner.nextDouble();
		Matrix matrix1 = new Matrix(a11, a12, a21, a22);

		System.out.println("Enter the elements of the second 2x2 matrix:");
		double b11 = scanner.nextDouble();
		double b12 = scanner.nextDouble();
		double b21 = scanner.nextDouble();
		double b22 = scanner.nextDouble();
		Matrix matrix2 = new Matrix(b11, b12, b21, b22);

		Matrix product = matrix1.multiply(matrix2);

		System.out.println("Product of matrices:");
		product.printMatrix();

	}
}