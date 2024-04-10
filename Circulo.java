public class Circulo {

	private double raio;

	public Circulo(double r) {
		this.raio = r;
		
	}
	public double getRaio() {
		return raio;
		
	}
	public void setRaio(double novoRaio) {
		this.raio = novoRaio;
		
	}
	public double calcularArea() {
		double pi; 
		pi = 3.14;
		return(raio * raio) * pi;
		

	}
	public double calcularPerimetro() {
		double pi;
		pi = 3.14;
		return 2 * pi * raio;
		
			
	}
	}
