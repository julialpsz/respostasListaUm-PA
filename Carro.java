public class Carro {
	
	private String modelo;
	private String marca;
	private int ano;
	private String placa;
	
	public Carro(String mo, String ma, int a, String p) {
		this.modelo = mo;
		this.marca = ma;
		this.ano = a;
		this.placa = p;
	}
	
	public String setModelo() {
		return modelo;
	}
	public String setMarca() {
		return marca;
	}
	public int setAno() {
		return ano;
	}
	public String setPlaca() {
		return placa;
	}
	public void setModelo(String novoModelo) {
		this.modelo = novoModelo;
	}
	public void setMarca(String novaMarca) {
		this.marca = novaMarca;
	}
	public void setAno(int novoAno) {
		this.ano = novoAno;
	}
	public void setPlaca(String novaPlaca) {
		this.placa = novaPlaca;
	}

}
