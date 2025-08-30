package newProject;

class Matrix {
	private double a11, a12, a21, a22;

	public Matrix(double a11, double a12, double a21, double a22) {
		this.a11 = a11;
		this.a12 = a12;
		this.a21 = a21;
		this.a22 = a22;
	}

	public double getA11() {
		return a11;
	}

	public void setA11(double a11) {
		this.a11 = a11;
	}

	public double getA12() {
		return a12;
	}

	public void setA12(double a12) {
		this.a12 = a12;
	}

	public double getA21() {
		return a21;
	}

	public void setA21(double a21) {
		this.a21 = a21;
	}

	public double getA22() {
		return a22;
	}

	public void setA22(double a22) {
		this.a22 = a22;
	}

	public void printMatrix() {
		System.out.println(this.a11 + " 	" + this.a12);
		System.out.println(this.a21 + " 	" + this.a22);
	}

	public Matrix multiply(Matrix m) {
		double c11 = this.a11 * m.getA11() + this.a12 * m.getA21();
		double c12 = this.a11 * m.getA12() + this.a12 * m.getA22();
		double c21 = this.a21 * m.getA11() + this.a22 * m.getA21();
		double c22 = this.a21 * m.getA12() + this.a22 * m.getA22();

		return new Matrix(c11, c12, c21, c22);
	}
}
