public class Triangulo {
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Triangulo (double a, double b, double c) {
		this.ladoA = a;
		this.ladoB = b;
		this.ladoC = c;
		
	}
	public double getLadoA() {
		return ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public double getLadoC() {
		return ladoC;
	}
	
	public void setLadoA (double novoA) {
		this.ladoA = novoA;
	}
	
	public void setLadoB(double novoB) {
		this.ladoB = novoB;
	}
	
	public void setLadoC(double novoC) {
		this.ladoC = novoC;
	}
	
	public double perimetroTriangulo() {
		return (this.ladoA + this.ladoB + this.ladoC);
	}
	
}
