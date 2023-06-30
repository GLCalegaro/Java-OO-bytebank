//Para definir tipos, no caso, o tipo da Conta, utilizamos "class"

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

	// Criando métodos: 'void' é utilizado quando n retornamos nada no método; nome
	// do método; o que irá receber entre "()" junto com o tipo;
	void deposita(double valor) {
		//this é uma referência para um objeto, no caso o objeto do conta, no caso a contaGiovanna;
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
			return false;
	}
}
