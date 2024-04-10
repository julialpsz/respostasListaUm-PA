public class Cliente {

	private String nome;
	private String cpf;
	private Data dataDeNascimento;

	public Cliente(String n, String c, Data d) {
	this.nome = n;
	this.cpf = c;
	this.dataDeNascimento = d;
	
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public Data getDataDeNascimento() {
	return dataDeNascimento;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
				
	}
	
	public void setCpf(String novoCpf) {
		this.cpf = novoCpf;
		
	}
	
	public void setDataDeNascimento(Data novaData) {
		this.dataDeNascimento = novaData;
		}
	
	
}
