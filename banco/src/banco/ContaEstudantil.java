package banco;

public class ContaEstudantil extends ContaNormal{
	private double emprestimo;
	
	public void setEmprestimo(double e) {
		emprestimo = e;
	}
	
	/*public void getEmprestimo() {
		return emprestimo;
	}*/
	
	public void creditar(double valor) {
		saldo = saldo + valor;
	}
	
	public void debitar(double valor) {
		if((saldo - valor + emprestimo) >= 0) {
			saldo = saldo - valor;
		}
	}
}
