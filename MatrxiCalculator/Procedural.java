package newProject;

public class Procedural {

	public static void main(String[] args) {
		double[][] matrix1 = { { 1, 2 }, { 3, 4 } };
		double[][] matrix2 = { { 5, 6 }, { 7, 8 } };

		if (isTwoByTwo(matrix1) && isTwoByTwo(matrix2)) {
			double[][] result = multiplyMatrices(matrix1, matrix2);
			printMatrix(result);
		}
	}

	public static boolean isTwoByTwo(double[][] matrix) {
		return matrix.length == 2 && matrix[0].length == 2 && matrix[1].length == 2;
	}

	public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2) {
		double[][] result = new double[2][2];

		result[0][0] = matrix1[0][0] * matrix2[0][0] + matrix1[0][1] * matrix2[1][0];
		result[0][1] = matrix1[0][0] * matrix2[0][1] + matrix1[0][1] * matrix2[1][1];
		result[1][0] = matrix1[1][0] * matrix2[0][0] + matrix1[1][1] * matrix2[1][0];
		result[1][1] = matrix1[1][0] * matrix2[0][1] + matrix1[1][1] * matrix2[1][1];

		return result;
	}

	public static void printMatrix(double[][] matrix) {
		System.out.println("Resultant Matrix:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}
}