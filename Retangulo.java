public class Retangulo {

	private double base;
	private double altura;

	public Retangulo(double b, double a) {
		this.base = b;
		this.altura = a;
	}
	public double getBase() {
		return base;
		
	}
	public double getAltura() {
		return altura;
	}
	public void setBase(double novaBase) {
		this.base = novaBase;
		
	}
	public void setAltura(double novaAltura) {
		this.altura = novaAltura;
		
	}
	public double calcularArea() {
		return base * altura;
		
	}
	public double perimetro(double base, double altura) {
		return base * 2 + altura * 2;
		
	}

	}
