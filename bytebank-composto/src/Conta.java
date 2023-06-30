//Para definir tipos, no caso, o tipo da Conta, utilizamos "class"

public class Conta {
	// double saldo = 100;
	// Cliente titular = new Cliente();
	// Podemos por exemplos atribuir valores default para contas novas, como por
	// exemplo 100 reais de saldo, ou quando der new Conta, ele será new Cliente,
	// automatizando e simplificando o processo,No nosso projeto não é uma opção
	// muito interessante, pois toda a conta tem de ser associada à um cliente novo,
	// banindo a possibilidade de um cliente ter duas contas, por exemplo. Porém, em
	// muitos casos, essa é uma alternativa interessante.

	// O atributo private é usado quando o atributo não pode ser lido e nem
	// modificado, a não ser a própria classe, por exemplo em deposita. O ideal é que todos os atributos sejam privados!
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

	// Criando métodos: 'void' é utilizado quando n retornamos nada no método; nome
	// do método; o que irá receber entre "()" junto com o tipo;
	void deposita(double valor) {
		// this é uma referência para um objeto, no caso o objeto do conta, no caso a
		// contaGiovanna;
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	//Método para acessar o saldo:
	public double getSaldo() {
		return this.saldo;
	}

}
