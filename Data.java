public class Data {
	
		private int dia;
		private int mes;
		private int ano;

		public Data(int d, int m, int a) {
			this.dia = d;
			this.mes = m;
			this.ano = a;
			
		}
		public int getDia() {
			return dia;
		}
		public int getMes() {
			return mes;
		}
		public int getAno() {
			return ano;
			
		}
		public void setDia(int novoDia) {
			this.dia = novoDia;
			
		}
		public void setMes(int novoMes) {
			this.mes = novoMes;
			
		}
		public void setAno(int novoAno) {
			this.ano = novoAno;
			
		}
		public String toString() {
			return dia + "/" + mes + "/" + ano;
			
		}
}
