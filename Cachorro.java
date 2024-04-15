public class Cachorro {

	private String nome;
	private String raca;
	private int idade;
	
	public Cachorro(String n, String r, int i) {
		this.nome = n;
		this.raca = r;
		this.idade = i;
	}
	
	public String getNome() {
	return nome;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setRaca(String novaRaca) {
		this.raca = novaRaca;	
	}
	
	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	
	public String latir() {	
	return "au au!";
	}
	
	
}
