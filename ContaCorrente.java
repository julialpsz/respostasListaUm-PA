public class ContaCorrente {

		private int numeroDaConta;
		private double saldo;

		 public ContaCorrente(int n, double s) {
			 this.numeroDaConta = n;
			 this.saldo = s;
		 }
		 public double getSaldo() {
			 return saldo;
			 }
		 public void setSaldo(double novoSaldo) {
			 this.saldo = novoSaldo;
			 
		 }
		 public double depositar(double deposito) {
			saldo = saldo + deposito;
			return saldo;
			
		 }
		 public double sacar(double saque) {
			 saldo = saldo - saque;
			 return saldo;
			 
		 }
		 public String toString() {
			 return "Conta:" + numeroDaConta + "\nSaldo: R$" + saldo;
			 
		 }
		}
