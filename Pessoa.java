public class Pessoa {

		private String nome;
		private int idade;
		private double altura;

		public Pessoa(String n, int i, double a) {
			this.nome = n;
			this.idade = i;
			this.altura = a;
		}
		public String getNome() {
			return nome;
		}
		
		public int getIdade() {
			return idade;
		}
		
		public double getAltura() {
			return altura;
		}
			
		
		public void setNome(String novoNome) {
		this.nome = novoNome; 
		}
		
		public void setIdade(int novoNome) {
		this.idade = novoNome; 
		}
		
		public void setAltura(double novaAltura) {
		this.altura = novaAltura;
		}
		
		public String toString() {
			return "Nome:" + nome + "\nIdade:" + idade + "\nAltura:" + altura;
		}

}
