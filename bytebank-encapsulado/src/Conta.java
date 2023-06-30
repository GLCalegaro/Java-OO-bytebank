//Para definir tipos, no caso, o tipo da Conta, utilizamos "class"

public class Conta {
	// O ideal é que todos os atributos sejam privados, e há vantagens como, se
	// precisar alterar algo, vc já pode ir direto na classe Conta, ao invés de ter
	// que procurar em toda a aplicação.
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	// Usamos o static para definir que o total faz parte da classe Conta, e não de
	// cada objeto Conta que for criado, senão o total nunca será somado nas
	// criações de conta, sempre serão 1. Por isso usamos o 'this' nos demais
	// atributos, pois o this faz referencia à determinada Conta, o static não, é um
	// atributo de instância geral para a classe, e podemos usar Conta.total para
	// ficar mais legível e claro;
	private static int total;

	// Criando um construtor de inicialização (construtores são inicializadores de
	// atributos):
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas abertas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Conta de nº " + this.numero + " e agência " + this.agencia + " criada com sucesso!");
		// Se quisermos por exemplo, saber quantas contas foram abertas, colocamos o
		// total++ no construtor e o atributo total = 0 na classe Conta
	}

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

	// Método para acessar o saldo:
	public double getSaldo() {
		return this.saldo;
	}

	// Método para acessar a conta:
	public int getNumero() {
		return this.numero;
	}

	// Método para alterar numero da conta - normalmente métodos que modificam algo,
	// não retornam nada, por isso o void. Normalmente as variáveis tem o mesmo nome
	// dos atributos, no caso do nº da conta, o parâmetro também será numero dentro
	// desse método, no caso: int numero.
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não é permitido usar valores menores do que 0! ");
			return;
		}
		this.numero = numero;
	}

	// Método para pegar a agencia:
	public int getAgencia() {
		return this.agencia;
	}

	// Método para alterar a agencia:
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não é permitido usar valores menores do que 0! ");
			return;
		}
		this.agencia = agencia;
	}

	// Método para pegar o titular:
	public Cliente getTitular() {
		return titular;
	}

	// Método para setar a agencia:
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	//Precisamos colocar o static também para o método entender que o atributo é da classe Conta;
	public static int getTotal() {
		return Conta.total;
	}
}
