public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String n, double p, int q) {
		this.nome = n;
		this.preco = p;
		this.quantidade = q;
		
	}
	public String getNome() {
		return nome;
		
	}
	public double getPreco() {
		return preco;
		
	}
	public int getQuantidade() {
		return quantidade;
		
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
		
	}
	
	public void setPreco(double novoPreco) {
		this.preco = novoPreco;
	}
	
	public void setQuantidade(int novaQuantidade) {
			this.quantidade = novaQuantidade; 
	
   }
	
	public double calcularTotal(double preco, int quantidade) {
		return preco * quantidade;
		
	}
	
	
}
